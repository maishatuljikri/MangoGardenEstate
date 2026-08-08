package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GenerateAnnualAccountingReportsViewController {

    @FXML
    private TextField fiscalYearField;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private TableView<?> annualReportTable;

    @FXML
    private TableColumn<?, ?> quarterColumn;

    @FXML
    private TableColumn<?, ?> totalRevenueColumn;

    @FXML
    private TableColumn<?, ?> totalExpensesColumn;

    @FXML
    private TableColumn<?, ?> netProfitColumn;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        if (reportTypeComboBox != null) {
            reportTypeComboBox.getItems().addAll("Full Fiscal Year Audit", "Executive Financial Summary", "Tax & Liability Overview");
        }
    }

    @FXML
    public void generateAnnualReportButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: green; -fx-font-size: 14px;");
            messageLabel.setText("Annual accounting report generated successfully!");
        }
    }

    @FXML
    public void downloadReportButtonOA(ActionEvent event) {
        if (messageLabel != null) {
            messageLabel.setStyle("-fx-text-fill: blue; -fx-font-size: 14px;");
            messageLabel.setText("Annual accounting report downloaded successfully!");
        }
    }

    @FXML
    public void clearButtonOA(ActionEvent event) {
        if (fiscalYearField != null) fiscalYearField.clear();
        if (reportTypeComboBox != null) reportTypeComboBox.getSelectionModel().clearSelection();
        if (messageLabel != null) messageLabel.setText("");
    }
}