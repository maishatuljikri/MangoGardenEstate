package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProcessEmployeeSalaryPaymentsViewController {

    @FXML
    private TextField employeeIdField;
    @FXML
    private TextField employeeNameField;
    @FXML
    private ComboBox<String> departmentComboBox;
    @FXML
    private DatePicker paymentDatePicker;
    @FXML
    private TextField basicSalaryField;
    @FXML
    private TextField bonusField;
    @FXML
    private TextField deductionsField;
    @FXML
    private TextField netPayableField;
    @FXML
    private ComboBox<String> paymentMethodComboBox;
    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (departmentComboBox != null) {
            departmentComboBox.getItems().addAll("Harvesting", "Processing & Packaging", "Transport & Delivery", "Administration");
        }
        if (paymentMethodComboBox != null) {
            paymentMethodComboBox.getItems().addAll("Bank Transfer", "Direct Deposit", "Cheque", "Cash");
        }
    }

    @FXML
    public void calculateNetPayButtonOA(ActionEvent event) {
        try {
            double basic = basicSalaryField.getText().isEmpty() ? 0.0 : Double.parseDouble(basicSalaryField.getText());
            double bonus = bonusField.getText().isEmpty() ? 0.0 : Double.parseDouble(bonusField.getText());
            double deductions = deductionsField.getText().isEmpty() ? 0.0 : Double.parseDouble(deductionsField.getText());

            double netPayable = basic + bonus - deductions;
            netPayableField.setText(String.format("%.2f", netPayable));

            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Net salary calculated!");
        } catch (NumberFormatException e) {
            messageLabel.setStyle("-fx-text-fill: red; -fx-font-size: 14px;");
            messageLabel.setText("Invalid numeric values for salary calculation.");
        }
    }

    @FXML
    public void processPaymentButtonOA(ActionEvent event) {
        if (employeeIdField.getText().isEmpty() || employeeNameField.getText().isEmpty() || basicSalaryField.getText().isEmpty()) {
            messageLabel.setStyle("-fx-text-fill: red; -fx-font-size: 14px;");
            messageLabel.setText("Please fill in required employee details!");
            return;
        }

        messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
        messageLabel.setText("Salary payment processed successfully!");
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        employeeIdField.clear();
        employeeNameField.clear();
        if (departmentComboBox != null) {
            departmentComboBox.getSelectionModel().clearSelection();
        }
        paymentDatePicker.setValue(null);
        basicSalaryField.clear();
        bonusField.clear();
        deductionsField.clear();
        netPayableField.clear();
        if (paymentMethodComboBox != null) {
            paymentMethodComboBox.getSelectionModel().clearSelection();
        }
        messageLabel.setText("");
    }
}
