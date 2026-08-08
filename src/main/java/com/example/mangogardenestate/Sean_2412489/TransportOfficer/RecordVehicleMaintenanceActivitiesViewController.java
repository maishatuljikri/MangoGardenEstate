package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RecordVehicleMaintenanceActivitiesViewController {

    @FXML
    private ComboBox<String> vehicleComboBox;

    @FXML
    private ComboBox<String> maintenanceTypeComboBox;

    @FXML
    private DatePicker maintenanceDatePicker;

    @FXML
    private TextField costField;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (vehicleComboBox != null) {
            vehicleComboBox.getItems().addAll("Truck - TRK01", "Covered Van - VAN02", "Refrigerated Truck - RT03", "Pickup - PK04");
        }
        if (maintenanceTypeComboBox != null) {
            maintenanceTypeComboBox.getItems().addAll("Routine Service", "Engine Repair", "Tire Replacement", "Brake Service", "Oil Change");
        }
    }

    @FXML
    public void saveMaintenanceButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Vehicle maintenance activity saved successfully!");
        }
    }

    @FXML
    public void recordMaintenanceButtonOA(ActionEvent event) {
        saveMaintenanceButtonOA(event);
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (vehicleComboBox != null) vehicleComboBox.getSelectionModel().clearSelection();
        if (maintenanceTypeComboBox != null) maintenanceTypeComboBox.getSelectionModel().clearSelection();
        if (maintenanceDatePicker != null) maintenanceDatePicker.setValue(null);
        if (costField != null) costField.clear();
        if (descriptionArea != null) descriptionArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}