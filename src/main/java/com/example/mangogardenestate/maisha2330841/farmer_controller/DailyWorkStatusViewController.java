package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.maisha2330841.nonuser.DailyWorkStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DailyWorkStatusViewController implements Initializable {

    @FXML
    private TextField workTitleField;

    @FXML
    private DatePicker workDatePicker;

    @FXML
    private TextField assignedTaskField;

    @FXML
    private TextArea workDetailsArea;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private Label messageLabel;

    private final String FILE_NAME = "DailyWorkStatus.bin";

    private ArrayList<DailyWorkStatus> workList = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        statusComboBox.getItems().addAll(
                "Not Started",
                "In Progress",
                "Completed"
        );

        workDatePicker.setValue(LocalDate.now());

        loadData();
    }

    @FXML
    public void saveButtonOA() {

        if (workTitleField.getText().isEmpty()
                || workDatePicker.getValue() == null
                || assignedTaskField.getText().isEmpty()
                || workDetailsArea.getText().isEmpty()
                || statusComboBox.getValue() == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all fields.");
            return;
        }

        DailyWorkStatus work = new DailyWorkStatus(

                workTitleField.getText(),
                workDatePicker.getValue(),
                assignedTaskField.getText(),
                workDetailsArea.getText(),
                statusComboBox.getValue()

        );

        workList.add(work);

        saveData();

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Saved Successfully.");

    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME));

            oos.writeObject(workList);

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

            workList =
                    (ArrayList<DailyWorkStatus>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    @FXML
    public void clearButtonOA() {

        workTitleField.clear();
        assignedTaskField.clear();
        workDetailsArea.clear();
        workDatePicker.setValue(LocalDate.now());
        statusComboBox.getSelectionModel().clearSelection();
        messageLabel.setText("");

    }

    @FXML
    public void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/mangogardenestate/farmerdeshboard.fxml"));

            Parent root = loader.load();

            Stage stage =
                    (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}