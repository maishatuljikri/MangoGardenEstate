package com.example.mangogardenestate.PackagingOfficer;

import com.example.mangogardenestate.common.RoleFormSupport;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RecordPackagedMangoesViewController {
    @FXML private TextField txtReference;
    @FXML private TextField txtDetails;
    @FXML private ComboBox<String> cmbStatus;
    @FXML private TextArea txtReport;
    private boolean recordRetrieved;
    private static final String TITLE = "Record Packaged Mangoes";

    @FXML public void initialize() {
        RoleFormSupport.loadStatusOptions(TITLE, cmbStatus);
    }

    @FXML public void searchData(ActionEvent actionEvent) {
        recordRetrieved = RoleFormSupport.retrieve(getClass().getName(), txtReference, txtDetails, cmbStatus, txtReport);
    }

    @FXML public void saveRecord(ActionEvent actionEvent) {
        RoleFormSupport.save(getClass().getName(), TITLE, recordRetrieved, txtReference, txtDetails, cmbStatus, txtReport);
    }

    @FXML public void viewReport(ActionEvent actionEvent) {
        RoleFormSupport.viewReport(getClass().getName(), TITLE);
    }

    @FXML public void clearForm(ActionEvent actionEvent) {
        RoleFormSupport.clear(txtReference, txtDetails, cmbStatus, txtReport);
        recordRetrieved = false;
    }

    @FXML public void goBack(ActionEvent actionEvent) {
        RoleFormSupport.goBack(txtReference, "/com/example/mangogardenestate/Packaging Officer/PackagingOfficerDashboard.fxml");
    }
}
