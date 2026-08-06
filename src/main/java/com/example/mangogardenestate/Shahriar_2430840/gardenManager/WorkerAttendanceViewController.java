package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.gardenManagerModelclass.WorkerAttendance;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WorkerAttendanceViewController {

    @FXML
    private TextField txtAttendanceId;

    @FXML
    private TextField txtWorkerId;

    @FXML
    private TextField txtWorkerName;

    @FXML
    private TextField txtAttendanceDate;

    @FXML
    private TextField txtStatus;

    @FXML
    private TextArea txtReport;

    private WorkerAttendance attendance;

    @FXML
    private void verifyAttendanceOA() {

        if (txtAttendanceId.getText().isBlank()) {

            showAlert("Please enter Attendance ID.");
            return;

        }

        // Sample Data
        txtWorkerId.setText("W001");
        txtWorkerName.setText("Rahim Uddin");
        txtAttendanceDate.setText("05-08-2026");
        txtStatus.setText("Present");

        showAlert("Attendance verified successfully.");
    }

    @FXML
    private void calculateSummaryOA() {

        if (txtStatus.getText().isBlank()) {

            showAlert("Attendance status is missing.");
            return;

        }

        String summary;

        if (txtStatus.getText().equalsIgnoreCase("Present")) {

            summary = "Worker is Present today.";

        } else {

            summary = "Worker is Absent today.";

        }

        txtReport.setText(summary);

        showAlert("Attendance summary calculated.");
    }

    @FXML
    private void viewReportOA() {

        if (txtAttendanceId.getText().isBlank()) {

            showAlert("Please verify attendance first.");
            return;

        }

        attendance = new WorkerAttendance(

                txtAttendanceId.getText(),

                txtWorkerId.getText(),

                txtWorkerName.getText(),

                txtAttendanceDate.getText(),

                txtStatus.getText()

        );

        txtReport.setText(

                "========== WORKER ATTENDANCE REPORT ==========\n\n"

                        + "Attendance ID : "
                        + attendance.getAttendanceId()

                        + "\n\nWorker ID : "
                        + attendance.getWorkerId()

                        + "\n\nWorker Name : "
                        + attendance.getWorkerName()

                        + "\n\nAttendance Date : "
                        + attendance.getAttendanceDate()

                        + "\n\nStatus : "
                        + attendance.getStatus()

        );

    }

    @FXML
    private void clearFormOA() {

        txtAttendanceId.clear();
        txtWorkerId.clear();
        txtWorkerName.clear();
        txtAttendanceDate.clear();
        txtStatus.clear();
        txtReport.clear();

        attendance = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("GardenManagerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtAttendanceId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Worker Attendance");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }
}