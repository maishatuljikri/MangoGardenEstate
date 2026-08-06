package com.example.mangogardenestate.EstateOwner;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AttendanceReportViewController
{
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private TableColumn colWorkerID;
    @javafx.fxml.FXML
    private TableColumn colCheckIn;
    @javafx.fxml.FXML
    private Button btnExport;
    @javafx.fxml.FXML
    private Label lblPresent;
    @javafx.fxml.FXML
    private Label lblLate;
    @javafx.fxml.FXML
    private TableView attendanceTable;
    @javafx.fxml.FXML
    private Button btnRefresh;
    @javafx.fxml.FXML
    private Button btnLoadAttendance;
    @javafx.fxml.FXML
    private Label lblAbsent;
    @javafx.fxml.FXML
    private TableColumn colCheckOut;
    @javafx.fxml.FXML
    private DatePicker attendanceDate;
    @javafx.fxml.FXML
    private TableColumn colWorkerName;
    @javafx.fxml.FXML
    private TableColumn colDepartment;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshAttendance(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadAttendance(ActionEvent actionEvent) {
    }
}