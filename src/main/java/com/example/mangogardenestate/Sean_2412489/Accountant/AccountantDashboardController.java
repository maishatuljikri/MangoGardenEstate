package com.example.mangogardenestate.Sean_2412489.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AccountantDashboardController {

    @FXML
    private AnchorPane mainContentPane;

    private void loadView(String fxmlFileName) {
        try {
            // Absolute path ensuring JavaFX always finds the FXML file
            URL resource = getClass().getResource("/com/example/mangogardenestate/Sean_2412489/Accountant/" + fxmlFileName);

            if (resource == null) {
                System.err.println("Error: FXML file not found -> " + fxmlFileName);
                return;
            }

            FXMLLoader loader = new FXMLLoader(resource);
            Node node = loader.load();
            mainContentPane.getChildren().setAll(node);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openGenerateAnnualReportsOA(ActionEvent event) {
        loadView("Generate Annual Accounting Reports.fxml");
    }

    @FXML
    public void openGenerateMonthlyReportsOA(ActionEvent event) {
        loadView("Generate Monthly Financial Reports.fxml");
    }

    @FXML
    public void openManageOperationalExpensesOA(ActionEvent event) {
        loadView("Manage Operational Expenses.fxml");
    }

    @FXML
    public void openManageSupplierInvoicesOA(ActionEvent event) {
        loadView("Manage Supplier Invoices.fxml");
    }

    @FXML
    public void openMonitorProfitAndLossOA(ActionEvent event) {
        loadView("Monitor Profit and Loss Summaries.fxml");
    }

    @FXML
    public void openProcessSalaryPaymentsOA(ActionEvent event) {
        loadView("Process Employee Salary Payments.fxml");
    }

    @FXML
    public void openRecordDailySalesOA(ActionEvent event) {
        loadView("Record Daily Sales Transactions.fxml");
    }

    @FXML
    public void openTrackCustomerPaymentRecordsOA(ActionEvent event) {
        loadView("Track Customer Payment Records.fxml");
    }

    @FXML
    public void logoutButtonOA(ActionEvent event) {
        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/com/example/mangogardenestate/LoginView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loginRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}