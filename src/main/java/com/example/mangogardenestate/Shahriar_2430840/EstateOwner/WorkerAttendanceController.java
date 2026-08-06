package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.EstateOwnerModelclass.WorkerAttendance;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WorkerAttendanceController {

    @FXML
    private TextField txtWorkerId;

    @FXML
    private TextField txtWorkerName;

    @FXML
    private TextField txtAttendanceDate;

    @FXML
    private TextField txtStatus;

    @FXML
    private TextField txtPresent;

    @FXML
    private TextArea txtReport;

    private WorkerAttendance attendance;

    @FXML
    private void searchAttendanceOA() {

        if (txtWorkerId.getText().trim().isEmpty()) {
            showAlert("Please enter Worker ID.");
            return;
        }

        // Sample Data
        attendance = new WorkerAttendance(
                txtWorkerId.getText(),
                "Rahim Uddin",
                "31-07-2026",
                "Present",
                26
        );

        txtWorkerName.setText(attendance.getWorkerName());
        txtAttendanceDate.setText(attendance.getAttendanceDate());
        txtStatus.setText(attendance.getStatus());
        txtPresent.setText(String.valueOf(attendance.getTotalPresent()));

        showAlert("Attendance record found.");
    }

    @FXML
    private void calculateAttendanceOA() {

        if (txtPresent.getText().trim().isEmpty()) {
            showAlert("Please enter total present days.");
            return;
        }

        try {

            int present = Integer.parseInt(txtPresent.getText());

            String percentage;

            if (present >= 26) {
                percentage = "100%";
            } else if (present >= 22) {
                percentage = "85%";
            } else if (present >= 18) {
                percentage = "70%";
            } else {
                percentage = "Below 70%";
            }

            txtReport.setText(
                    "Attendance Summary\n\n" +
                            "Worker : " + txtWorkerName.getText() + "\n" +
                            "Present Days : " + present + "\n" +
                            "Attendance : " + percentage
            );

            showAlert("Attendance calculated successfully.");

        } catch (NumberFormatException e) {

            showAlert("Present days must be numeric.");

        }

    }

    @FXML
    private void viewReportOA() {

        if (attendance == null) {
            showAlert("Please search attendance first.");
            return;
        }

        txtReport.setText(
                "========== WORKER ATTENDANCE REPORT ==========\n\n" +
                        "Worker ID : " + attendance.getWorkerId() + "\n\n" +
                        "Worker Name : " + attendance.getWorkerName() + "\n\n" +
                        "Attendance Date : " + attendance.getAttendanceDate() + "\n\n" +
                        "Status : " + attendance.getStatus() + "\n\n" +
                        "Total Present : " + attendance.getTotalPresent() + " Days"
        );
    }

    @FXML
    private void clearFormOA() {

        txtWorkerId.clear();
        txtWorkerName.clear();
        txtAttendanceDate.clear();
        txtStatus.clear();
        txtPresent.clear();
        txtReport.clear();

        attendance = null;
    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("OwnerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) txtWorkerId.getScene().getWindow();

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