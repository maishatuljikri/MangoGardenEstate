package com.example.mangogardenestate.EstateOwner;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class MonthlyExpenseReportViewController
{
    @javafx.fxml.FXML
    private TableColumn colAmount;
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private Button btnLoadExpenses;
    @javafx.fxml.FXML
    private Button btnRefresh;
    @javafx.fxml.FXML
    private Button btnExport;
    @javafx.fxml.FXML
    private TableView expenseTable;
    @javafx.fxml.FXML
    private TableColumn colDescription;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colCategory;
    @javafx.fxml.FXML
    private ComboBox cmbYear;
    @javafx.fxml.FXML
    private Label lblTotalExpense;
    @javafx.fxml.FXML
    private ComboBox cmbMonth;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadExpenseReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshReport(ActionEvent actionEvent) {
    }
}