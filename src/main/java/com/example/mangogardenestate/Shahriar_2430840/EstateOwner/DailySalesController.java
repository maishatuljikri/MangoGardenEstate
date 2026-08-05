package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.Modelclass3.DailySales;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DailySalesController {

    @FXML
    private TextField txtSalesId;

    @FXML
    private TextField txtSalesDate;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextArea txtSummary;

    private DailySales sales;

    @FXML
    private void searchSalesOA() {

        if (txtSalesId.getText().trim().isEmpty()) {
            showAlert("Please enter Sales ID.");
            return;
        }

        // Sample Data
        sales = new DailySales(
                txtSalesId.getText(),
                "31-07-2026",
                "ABC Traders",
                450,
                67500
        );

        txtSalesDate.setText(sales.getSalesDate());
        txtCustomerName.setText(sales.getCustomerName());
        txtQuantity.setText(String.valueOf(sales.getQuantity()));
        txtAmount.setText(String.valueOf(sales.getAmount()));

        showAlert("Sales record found.");
    }

    @FXML
    private void calculateSalesOA() {

        if (txtQuantity.getText().trim().isEmpty() ||
                txtAmount.getText().trim().isEmpty()) {

            showAlert("Quantity and Amount are required.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());
            double amount = Double.parseDouble(txtAmount.getText());

            double pricePerKg = amount / quantity;

            txtSummary.setText(
                    "Sales Calculation\n\n" +
                            "Quantity : " + quantity + " Kg\n" +
                            "Total Sales : " + amount + " Tk\n" +
                            "Price Per Kg : " + String.format("%.2f", pricePerKg) + " Tk"
            );

            showAlert("Sales calculated successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter valid numeric values.");

        }

    }

    @FXML
    private void viewSummaryOA() {

        if (sales == null) {
            showAlert("Please search a sales record first.");
            return;
        }

        txtSummary.setText(
                "========== DAILY SALES REPORT ==========\n\n" +
                        "Sales ID : " + sales.getSalesId() + "\n\n" +
                        "Sales Date : " + sales.getSalesDate() + "\n\n" +
                        "Customer Name : " + sales.getCustomerName() + "\n\n" +
                        "Quantity : " + sales.getQuantity() + " Kg\n\n" +
                        "Sales Amount : " + sales.getAmount() + " Tk"
        );

    }

    @FXML
    private void clearFormOA() {

        txtSalesId.clear();
        txtSalesDate.clear();
        txtCustomerName.clear();
        txtQuantity.clear();
        txtAmount.clear();
        txtSummary.clear();

        sales = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("OwnerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) txtSalesId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Daily Sales Record");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}