package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageWarehouseDispatchOperationsViewController {

    @FXML
    private TextField dispatchIdField;

    @FXML
    private TextField orderIdField;

    @FXML
    private ComboBox<String> vehicleComboBox;

    @FXML
    private ComboBox<String> dispatchStatusComboBox;

    @FXML
    private DatePicker dispatchDatePicker;

    @FXML
    private TextArea notesArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (vehicleComboBox != null) {
            vehicleComboBox.getItems().addAll("Truck - TRK01", "Covered Van - VAN02", "Refrigerated Truck - RT03", "Pickup - PK04");
        }
        if (dispatchStatusComboBox != null) {
            dispatchStatusComboBox.getItems().addAll("Scheduled", "In Transit", "Dispatched", "Delayed", "Cancelled");
        }
    }

    @FXML
    public void confirmDispatchButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Warehouse dispatch confirmed successfully!");
        }
    }

    @FXML
    public void dispatchOrderButtonOA(ActionEvent event) {
        confirmDispatchButtonOA(event);
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (dispatchIdField != null) dispatchIdField.clear();
        if (orderIdField != null) orderIdField.clear();
        if (vehicleComboBox != null) vehicleComboBox.getSelectionModel().clearSelection();
        if (dispatchStatusComboBox != null) dispatchStatusComboBox.getSelectionModel().clearSelection();
        if (dispatchDatePicker != null) dispatchDatePicker.setValue(null);
        if (notesArea != null) notesArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}