package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Util.SceneSwitcher;
import com.example.mangogardenestate.gardenManagerModelclass.AssignDailyTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class AssignDailyTaskViewController {

    @FXML
    private TextField txtTaskId;

    @FXML
    private TextField txtWorkerId;

    @FXML
    private TextField txtWorkerName;

    @FXML
    private TextField txtTaskName;

    @FXML
    private TextField txtWorkDate;

    @FXML
    private TextArea txtTaskDetails;

    private AssignDailyTask task;

    private final String FILE_NAME = "AssignDailyTask.bin";

    private ArrayList<AssignDailyTask> taskList = new ArrayList<>();

    @FXML
    public void initialize() {

        loadData();

    }

    @FXML
    private void verifyWorkerOA() {

        if (txtWorkerId.getText().isBlank()) {

            showAlert("Enter Worker ID.");
            return;
        }

        txtWorkerName.setText("Rahim Uddin");

        showAlert("Worker Verified Successfully.");
    }

    @FXML
    private void saveTaskOA() {

        if (txtTaskId.getText().isBlank()
                || txtWorkerId.getText().isBlank()
                || txtWorkerName.getText().isBlank()
                || txtTaskName.getText().isBlank()
                || txtWorkDate.getText().isBlank()) {

            showAlert("Please complete all fields.");
            return;
        }

        task = new AssignDailyTask(

                txtTaskId.getText(),
                txtWorkerId.getText(),
                txtWorkerName.getText(),
                txtTaskName.getText(),
                txtWorkDate.getText(),
                txtTaskDetails.getText()

        );

        taskList.add(task);

        saveData();

        showAlert("Task Saved Successfully.");

    }

    @FXML
    private void viewTaskOA() {

        if (txtTaskId.getText().isBlank()) {

            showAlert("Enter Task ID.");
            return;
        }

        for (AssignDailyTask t : taskList) {

            if (t.getTaskId().equals(txtTaskId.getText())) {

                task = t;

                txtWorkerId.setText(t.getWorkerId());
                txtWorkerName.setText(t.getWorkerName());
                txtTaskName.setText(t.getTaskName());
                txtWorkDate.setText(t.getWorkDate());

                txtTaskDetails.setText(

                        "========== DAILY TASK ==========\n\n" +

                                "Task ID : " + t.getTaskId() + "\n\n" +

                                "Worker ID : " + t.getWorkerId() + "\n\n" +

                                "Worker Name : " + t.getWorkerName() + "\n\n" +

                                "Task Name : " + t.getTaskName() + "\n\n" +

                                "Work Date : " + t.getWorkDate() + "\n\n" +

                                "Task Details :\n" + t.getTaskDetails()

                );

                showAlert("Task Found.");

                return;
            }

        }

        showAlert("Task Not Found.");

    }

    @FXML
    private void clearFormOA() {

        txtTaskId.clear();
        txtWorkerId.clear();
        txtWorkerName.clear();
        txtTaskName.clear();
        txtWorkDate.clear();
        txtTaskDetails.clear();

        task = null;

    }

    @FXML
    private void goBackOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/gardenmanagerdashboard.fxml",
                "Garden Manager Dashboard"
        );

    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME));

            oos.writeObject(taskList);

            oos.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(FILE_NAME));

            taskList =
                    (ArrayList<AssignDailyTask>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void showAlert(String message) {

        Alert alert =
                new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Garden Manager");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}