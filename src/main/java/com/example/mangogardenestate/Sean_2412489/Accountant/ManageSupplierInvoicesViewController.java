package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageSupplierInvoicesViewController {

    @FXML
    private TextField invoiceIdField;

    @FXML
    private ComboBox<String> supplierComboBox;

    @FXML
    private DatePicker invoiceDatePicker;

    @FXML
    private DatePicker dueDatePicker;

    @FXML
    private TextField invoiceAmountField;

    @FXML
    private ComboBox<String> paymentStatusComboBox;

    @FXML
    private TextArea notesArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (supplierComboBox != null) {
            supplierComboBox.getItems().addAll("AgriFertilizers Ltd.", "Mango Packaging Supplies", "GreenField Logistics", "BioPest Control");
        }
        if (paymentStatusComboBox != null) {
            paymentStatusComboBox.getItems().addAll("Unpaid", "Partially Paid", "Paid", "Overdue");
        }
    }

    @FXML
    public void saveInvoiceButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Supplier invoice saved successfully!");
        }
    }

    @FXML
    public void processInvoiceButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Supplier invoice processed successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (invoiceIdField != null) invoiceIdField.clear();
        if (supplierComboBox != null) supplierComboBox.getSelectionModel().clearSelection();
        if (invoiceDatePicker != null) invoiceDatePicker.setValue(null);
        if (dueDatePicker != null) dueDatePicker.setValue(null);
        if (invoiceAmountField != null) invoiceAmountField.clear();
        if (paymentStatusComboBox != null) paymentStatusComboBox.getSelectionModel().clearSelection();
        if (notesArea != null) notesArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}