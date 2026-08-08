package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageDriverAssignmentsViewController {

    @FXML
    private ComboBox<String> driverComboBox;

    @FXML
    private ComboBox<String> vehicleComboBox;

    @FXML
    private TextField routeField;

    @FXML
    private DatePicker assignmentDatePicker;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (driverComboBox != null) {
            driverComboBox.getItems().addAll("John Doe", "Robert Smith", "Michael Johnson", "David Wilson");
        }
        if (vehicleComboBox != null) {
            vehicleComboBox.getItems().addAll("Truck - TRK01", "Covered Van - VAN02", "Refrigerated Truck - RT03", "Pickup - PK04");
        }
    }

    @FXML
    public void assignDriverButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Driver assigned successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (driverComboBox != null) driverComboBox.getSelectionModel().clearSelection();
        if (vehicleComboBox != null) vehicleComboBox.getSelectionModel().clearSelection();
        if (routeField != null) routeField.clear();
        if (assignmentDatePicker != null) assignmentDatePicker.setValue(null);
        if (messageLabel != null) messageLabel.setText("");
    }
}