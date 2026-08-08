package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TrackDeliveryStatusViewController {

    @FXML
    private TextField deliveryIdField;

    @FXML
    private ComboBox<String> deliveryStatusComboBox;

    @FXML
    private TableView<?> deliveryStatusTable;

    @FXML
    private TableColumn<?, ?> deliveryIdColumn;

    @FXML
    private TableColumn<?, ?> customerColumn;

    @FXML
    private TableColumn<?, ?> vehicleColumn;

    @FXML
    private TableColumn<?, ?> driverColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TableColumn<?, ?> estimatedArrivalColumn;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (deliveryStatusComboBox != null) {
            deliveryStatusComboBox.getItems().addAll("Scheduled", "In Transit", "Out for Delivery", "Delivered", "Delayed", "Cancelled");
        }
    }

    @FXML
    public void searchDeliveryButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Delivery status searched successfully!");
        }
    }

    @FXML
    public void trackDeliveryButtonOA(ActionEvent event) {
        searchDeliveryButtonOA(event);
    }

    @FXML
    public void updateStatusButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Delivery status updated successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (deliveryIdField != null) deliveryIdField.clear();
        if (deliveryStatusComboBox != null) deliveryStatusComboBox.getSelectionModel().clearSelection();
        if (messageLabel != null) messageLabel.setText("");
    }
}