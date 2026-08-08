package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RecordDailySalesTransactionsViewController {

    @FXML
    private TextField orderIdField;
    @FXML
    private TextField customerNameField;
    @FXML
    private DatePicker transactionDatePicker;
    @FXML
    private TextField amountField;
    @FXML
    private ComboBox<String> paymentMethodComboBox;
    @FXML
    private TextArea notesArea;
    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (paymentMethodComboBox != null) {
            paymentMethodComboBox.getItems().addAll("Cash", "Credit Card", "Bank Transfer", "Mobile Banking");
        }
    }

    @FXML
    public void saveSalesButtonOA(ActionEvent event) {
        if (orderIdField.getText().isEmpty() || customerNameField.getText().isEmpty() || amountField.getText().isEmpty()) {
            messageLabel.setStyle("-fx-text-fill: red; -fx-font-size: 14px;");
            messageLabel.setText("Please fill in all required fields!");
            return;
        }

        messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
        messageLabel.setText("Sales transaction recorded successfully!");
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        orderIdField.clear();
        customerNameField.clear();
        transactionDatePicker.setValue(null);
        amountField.clear();
        if (paymentMethodComboBox != null) {
            paymentMethodComboBox.getSelectionModel().clearSelection();
        }
        notesArea.clear();
        messageLabel.setText("");
    }
}
