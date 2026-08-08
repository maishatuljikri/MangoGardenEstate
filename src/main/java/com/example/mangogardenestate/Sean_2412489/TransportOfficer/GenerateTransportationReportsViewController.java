package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GenerateTransportationReportsViewController {

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private TableView<?> reportTableView;

    @FXML
    private TableColumn<?, ?> reportIdColumn;

    @FXML
    private TableColumn<?, ?> vehicleColumn;

    @FXML
    private TableColumn<?, ?> driverColumn;

    @FXML
    private TableColumn<?, ?> distanceColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (reportTypeComboBox != null) {
            reportTypeComboBox.getItems().addAll(
                    "Monthly Transport Summary",
                    "Fuel Efficiency Report",
                    "Vehicle Maintenance Log",
                    "Driver Trip Summary"
            );
        }
    }

    @FXML
    public void generateReportButtonOA(ActionEvent event) {
        if (reportTypeComboBox != null && reportTypeComboBox.getValue() == null) {
            if (messageLabel != null) {
                messageLabel.setStyle("-fx-text-fill: red; -fx-font-size: 14px;");
                messageLabel.setText("Please select a report type!");
            }
            return;
        }

        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Transportation report generated successfully!");
        }
    }

    @FXML
    public void downloadReportButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: blue; -fx-font-size: 14px;");
            messageLabel.setText("Transportation report downloaded successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (reportTypeComboBox != null) reportTypeComboBox.getSelectionModel().clearSelection();
        if (startDatePicker != null) startDatePicker.setValue(null);
        if (endDatePicker != null) endDatePicker.setValue(null);
        if (messageLabel != null) messageLabel.setText("");
    }
}