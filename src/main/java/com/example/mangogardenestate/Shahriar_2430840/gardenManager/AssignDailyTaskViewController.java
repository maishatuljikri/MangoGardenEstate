package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.gardenManagerModelclass.AssignDailyTask;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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

    @FXML
    private void verifyWorkerOA() {

        if (txtWorkerId.getText().isBlank()) {
            showAlert("Enter Worker ID");
            return;
        }

        // Sample Worker
        txtWorkerName.setText("Rahim Uddin");

        showAlert("Worker Verified Successfully");
    }

    @FXML
    private void saveTaskOA() {

        if (txtTaskId.getText().isBlank()
                || txtWorkerId.getText().isBlank()
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

        showAlert("Task Saved Successfully.");

    }

    @FXML
    private void viewTaskOA() {

        if (task == null) {

            showAlert("Please save task first.");
            return;

        }

        txtTaskDetails.setText(

                "========== DAILY TASK ==========\n\n"

                        + "Task ID : "
                        + task.getTaskId()

                        + "\nWorker ID : "
                        + task.getWorkerId()

                        + "\nWorker Name : "
                        + task.getWorkerName()

                        + "\nTask Name : "
                        + task.getTaskName()

                        + "\nWork Date : "
                        + task.getWorkDate()

                        + "\n\nTask Details :\n"
                        + task.getTaskDetails()

        );

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
    private void goBackOA() {

        showAlert("Back button clicked.");

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Garden Manager");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}