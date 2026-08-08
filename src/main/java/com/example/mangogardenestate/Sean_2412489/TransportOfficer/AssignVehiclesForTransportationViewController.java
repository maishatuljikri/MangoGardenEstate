package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AssignVehiclesForTransportationViewController {

    @FXML
    private TextField assignmentIdField;

    @FXML
    private ComboBox<String> vehicleComboBox;

    @FXML
    private ComboBox<String> driverComboBox;

    @FXML
    private DatePicker assignmentDatePicker;

    @FXML
    private TextField destinationField;

    @FXML
    private TextArea notesArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (vehicleComboBox != null) {
            vehicleComboBox.getItems().addAll("Truck - TRK01", "Covered Van - VAN02", "Refrigerated Truck - RT03", "Pickup - PK04");
        }
        if (driverComboBox != null) {
            driverComboBox.getItems().addAll("John Doe", "Robert Smith", "Michael Johnson", "David Wilson");
        }
    }

    @FXML
    public void assignVehicleButtonOA(ActionEvent event) {
        if (assignmentIdField != null && (assignmentIdField.getText().isEmpty() || vehicleComboBox.getValue() == null || driverComboBox.getValue() == null)) {
            if (messageLabel != null) {
                messageLabel.setStyle("-fx-text-fill: red; -fx-font-size: 14px;");
                messageLabel.setText("Please fill in required assignment details!");
            }
            return;
        }

        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Vehicle assigned successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (assignmentIdField != null) assignmentIdField.clear();
        if (vehicleComboBox != null) vehicleComboBox.getSelectionModel().clearSelection();
        if (driverComboBox != null) driverComboBox.getSelectionModel().clearSelection();
        if (assignmentDatePicker != null) assignmentDatePicker.setValue(null);
        if (destinationField != null) destinationField.clear();
        if (notesArea != null) notesArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}