package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.EstateOwnerModelclass.WorkerAttendance;
import com.example.mangogardenestate.Util.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

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

    private final String FILE_NAME = "WorkerAttendance.bin";

    private ArrayList<WorkerAttendance> attendanceList = new ArrayList<>();

    @FXML
    public void initialize() {

        loadData();

    }

    @FXML
    private void searchAttendanceOA() {

        if (txtWorkerId.getText().isBlank()) {

            showAlert("Enter Worker ID");
            return;
        }

        boolean found = false;

        for (WorkerAttendance wa : attendanceList) {

            if (wa.getWorkerId().equals(txtWorkerId.getText())) {

                attendance = wa;

                txtWorkerName.setText(wa.getWorkerName());
                txtAttendanceDate.setText(wa.getAttendanceDate());
                txtStatus.setText(wa.getStatus());
                txtPresent.setText(String.valueOf(wa.getTotalPresent()));

                found = true;
                break;
            }
        }

        if (!found) {

            showAlert("Worker not found.");

        }

    }

    @FXML
    private void calculateAttendanceOA() {

        try {

            attendance = new WorkerAttendance(

                    txtWorkerId.getText(),
                    txtWorkerName.getText(),
                    txtAttendanceDate.getText(),
                    txtStatus.getText(),
                    Integer.parseInt(txtPresent.getText())
            );

            attendanceList.add(attendance);

            saveData();

            txtReport.setText(
                    "Attendance Saved Successfully\n\n" +
                            "Worker : " + attendance.getWorkerName() +
                            "\nPresent Days : " + attendance.getTotalPresent()
            );

            showAlert("Attendance saved successfully.");

        } catch (NumberFormatException e) {

            showAlert("Present Days must be numeric.");

        }

    }

    @FXML
    private void viewReportOA() {

        if (attendance == null) {

            showAlert("Search attendance first.");
            return;
        }

        txtReport.setText(

                "========== WORKER ATTENDANCE ==========\n\n" +
                        "Worker ID : " + attendance.getWorkerId() + "\n\n" +
                        "Worker Name : " + attendance.getWorkerName() + "\n\n" +
                        "Attendance Date : " + attendance.getAttendanceDate() + "\n\n" +
                        "Status : " + attendance.getStatus() + "\n\n" +
                        "Total Present : " + attendance.getTotalPresent()

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

    }

    @FXML
    private void goBackOA(ActionEvent event) {

        SceneSwitcher.switchScene(
                event,
                "/com/example/mangogardenestate/estateownerdashboard.fxml",
                "Estate Owner Dashboard"
        );

    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(attendanceList);

            oos.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists())
            return;

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            attendanceList =
                    (ArrayList<WorkerAttendance>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Worker Attendance");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }
}