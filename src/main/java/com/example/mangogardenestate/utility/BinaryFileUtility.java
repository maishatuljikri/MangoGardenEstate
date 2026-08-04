package com.example.mangogardenestate.utility;

import java.io.*;
import java.util.ArrayList;

public class BinaryFileUtility {

    public static ArrayList<Object> readObjects(String fileName) {

        ArrayList<Object> objects = new ArrayList<>();

        if (fileName == null || fileName.isBlank()) {
            return objects;
        }

        File file = new File(fileName);

        if (!file.exists() || file.length() == 0) {
            return objects;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                objects.add(ois.readObject());
            }

        } catch (EOFException e) {
            // End of file reached

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objects;
    }

    public static boolean writeObjects(String fileName, Object object) {

        if (fileName == null || object == null) {
            return false;
        }

        ObjectOutputStream oos = null;

        try {

            File file = new File(fileName);

            if (file.exists() && file.length() > 0) {

                oos = new ObjectStreamAppender(
                        new FileOutputStream(file, true));

            } else {

                oos = new ObjectOutputStream(
                        new FileOutputStream(file));

            }

            oos.writeObject(object);

            return true;

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (oos != null) {

                try {

                    oos.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        }

        return false;
    }

    public static boolean overwriteObjects(String fileName,
                                           ArrayList<Object> objects) {

        if (fileName == null || objects == null) {
            return false;
        }

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            for (Object obj : objects) {

                oos.writeObject(obj);

            }

            return true;

        } catch (IOException e) {

            e.printStackTrace();

        }

        return false;
    }

}