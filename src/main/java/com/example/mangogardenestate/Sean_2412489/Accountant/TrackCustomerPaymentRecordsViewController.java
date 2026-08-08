package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TrackCustomerPaymentRecordsViewController {

    @FXML
    private TextField customerSearchField;

    @FXML
    private ComboBox<String> statusFilterComboBox;

    @FXML
    private TableView<?> paymentRecordsTable;

    @FXML
    private TableColumn<?, ?> paymentIdColumn;

    @FXML
    private TableColumn<?, ?> orderIdColumn;

    @FXML
    private TableColumn<?, ?> customerNameColumn;

    @FXML
    private TableColumn<?, ?> amountColumn;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (statusFilterComboBox != null) {
            statusFilterComboBox.getItems().addAll("All Statuses", "Paid", "Pending", "Overdue", "Partial Payment");
        }
    }

    @FXML
    public void searchPaymentsButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Payment records loaded successfully!");
        }
    }

    @FXML
    public void updateStatusButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Customer payment status updated successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (customerSearchField != null) customerSearchField.clear();
        if (statusFilterComboBox != null) statusFilterComboBox.getSelectionModel().clearSelection();
        if (messageLabel != null) messageLabel.setText("");
    }
}
