package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MonitorFuelConsumptionRecordsViewController {

    @FXML
    private ComboBox<String> vehicleComboBox;

    @FXML
    private TextField monthField;

    @FXML
    private DatePicker recordDatePicker;

    @FXML
    private TextField fuelQuantityField;

    @FXML
    private TextField fuelCostField;

    @FXML
    private TextField currentOdometerField;

    @FXML
    private TableView<?> fuelTable;

    @FXML
    private Label totalFuelLabel;

    @FXML
    private Label totalCostLabel;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (vehicleComboBox != null) {
            vehicleComboBox.getItems().addAll("Truck - TRK01", "Covered Van - VAN02", "Refrigerated Truck - RT03", "Pickup - PK04");
        }
    }

    @FXML
    public void filterFuelLogButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Fuel records filtered successfully!");
        }
    }

    @FXML
    public void recordFuelButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Fuel consumption record saved successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (vehicleComboBox != null) vehicleComboBox.getSelectionModel().clearSelection();
        if (monthField != null) monthField.clear();
        if (recordDatePicker != null) recordDatePicker.setValue(null);
        if (fuelQuantityField != null) fuelQuantityField.clear();
        if (fuelCostField != null) fuelCostField.clear();
        if (currentOdometerField != null) currentOdometerField.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}