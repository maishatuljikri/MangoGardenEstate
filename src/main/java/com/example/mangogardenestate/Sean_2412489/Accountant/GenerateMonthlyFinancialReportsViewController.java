package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GenerateMonthlyFinancialReportsViewController {

    @FXML
    private ComboBox<String> monthComboBox;

    @FXML
    private TextField yearField;

    @FXML
    private TableView<?> financialTable;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (monthComboBox != null) {
            monthComboBox.getItems().addAll(
                    "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"
            );
        }
    }

    @FXML
    public void generateReportButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Monthly financial report generated successfully!");
        }
    }

    @FXML
    public void downloadReportButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: blue; -fx-font-size: 14px;");
            messageLabel.setText("Monthly financial report downloaded successfully!");
        }
    }

    @FXML
    public void exportReportButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: blue; -fx-font-size: 14px;");
            messageLabel.setText("Report exported successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (monthComboBox != null) monthComboBox.getSelectionModel().clearSelection();
        if (yearField != null) yearField.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}