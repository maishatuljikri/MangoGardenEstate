package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ScheduleMangoDeliveriesViewController {

    @FXML
    private TextField deliveryIdField;

    @FXML
    private TextField orderIdField;

    @FXML
    private ComboBox<String> customerComboBox;

    @FXML
    private ComboBox<String> vehicleComboBox;

    @FXML
    private ComboBox<String> driverComboBox;

    @FXML
    private DatePicker deliveryDatePicker;

    @FXML
    private TextArea deliveryAddressArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (customerComboBox != null) {
            customerComboBox.getItems().addAll("Fresh Fruits Ltd.", "Agrimart Supermarket", "City Retailers", "Green Agro Center");
        }
        if (vehicleComboBox != null) {
            vehicleComboBox.getItems().addAll("Truck - TRK01", "Covered Van - VAN02", "Refrigerated Truck - RT03", "Pickup - PK04");
        }
        if (driverComboBox != null) {
            driverComboBox.getItems().addAll("John Doe", "Robert Smith", "Michael Johnson", "David Wilson");
        }
    }

    @FXML
    public void scheduleDeliveryButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Mango delivery scheduled successfully!");
        }
    }

    @FXML
    public void saveScheduleButtonOA(ActionEvent event) {
        scheduleDeliveryButtonOA(event);
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (deliveryIdField != null) deliveryIdField.clear();
        if (orderIdField != null) orderIdField.clear();
        if (customerComboBox != null) customerComboBox.getSelectionModel().clearSelection();
        if (vehicleComboBox != null) vehicleComboBox.getSelectionModel().clearSelection();
        if (driverComboBox != null) driverComboBox.getSelectionModel().clearSelection();
        if (deliveryDatePicker != null) deliveryDatePicker.setValue(null);
        if (deliveryAddressArea != null) deliveryAddressArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}