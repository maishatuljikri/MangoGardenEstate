package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageOperationalExpensesViewController {

    @FXML
    private TextField amountField;

    @FXML
    private DatePicker expenseDatePicker;

    @FXML
    private TextArea detailsArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void saveExpenseButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Operational expense saved successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (amountField != null) amountField.clear();
        if (expenseDatePicker != null) expenseDatePicker.setValue(null);
        if (detailsArea != null) detailsArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}