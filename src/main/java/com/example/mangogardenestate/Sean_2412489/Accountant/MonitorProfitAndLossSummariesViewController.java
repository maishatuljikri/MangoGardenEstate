package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MonitorProfitAndLossSummariesViewController {

    @FXML
    private ComboBox<String> fiscalYearComboBox;
    @FXML
    private ComboBox<String> quarterComboBox;
    @FXML
    private TextField yearField;
    @FXML
    private TextField totalRevenueField;
    @FXML
    private TextField totalExpensesField;
    @FXML
    private TextField netProfitLossField;
    @FXML
    private TextArea summaryNotesArea;
    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (fiscalYearComboBox != null) {
            fiscalYearComboBox.getItems().addAll("2024", "2025", "2026");
        }
        if (quarterComboBox != null) {
            quarterComboBox.getItems().addAll("Q1 (Jan-Mar)", "Q2 (Apr-Jun)", "Q3 (Jul-Sep)", "Q4 (Oct-Dec)");
        }
    }

    @FXML
    public void viewSummaryButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Profit & Loss summary loaded successfully!");
        }
    }

    @FXML
    public void calculateSummaryButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Summary calculated successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (fiscalYearComboBox != null) fiscalYearComboBox.getSelectionModel().clearSelection();
        if (quarterComboBox != null) quarterComboBox.getSelectionModel().clearSelection();
        if (yearField != null) yearField.clear();
        if (totalRevenueField != null) totalRevenueField.clear();
        if (totalExpensesField != null) totalExpensesField.clear();
        if (netProfitLossField != null) netProfitLossField.clear();
        if (summaryNotesArea != null) summaryNotesArea.clear();
        if (messageLabel != null) messageLabel.setText("");
    }
}