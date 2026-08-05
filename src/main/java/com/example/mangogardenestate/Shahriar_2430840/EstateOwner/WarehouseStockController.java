package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.Modelclass3.WarehouseStock;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WarehouseStockController {

    @FXML
    private TextField txtStockId;

    @FXML
    private TextField txtVariety;

    @FXML
    private TextField txtSection;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtStatus;

    @FXML
    private TextArea txtSummary;

    private WarehouseStock stock;

    @FXML
    private void searchStockOA() {

        if (txtStockId.getText().trim().isEmpty()) {
            showAlert("Please enter Stock ID.");
            return;
        }

        // Sample Data
        stock = new WarehouseStock(
                txtStockId.getText(),
                "Himsagar",
                "Warehouse-A",
                2500,
                "Available"
        );

        txtVariety.setText(stock.getVariety());
        txtSection.setText(stock.getSection());
        txtQuantity.setText(String.valueOf(stock.getQuantity()));
        txtStatus.setText(stock.getStatus());

        showAlert("Warehouse stock found.");

    }

    @FXML
    private void calculateStockOA() {

        if (txtQuantity.getText().trim().isEmpty()) {
            showAlert("Please enter available quantity.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());

            String stockLevel;

            if (quantity >= 2000) {
                stockLevel = "High Stock";
            } else if (quantity >= 1000) {
                stockLevel = "Medium Stock";
            } else {
                stockLevel = "Low Stock";
            }

            txtSummary.setText(
                    "Current Quantity : " + quantity + " Kg\n\n" +
                            "Stock Level : " + stockLevel
            );

            showAlert("Stock calculated successfully.");

        } catch (NumberFormatException e) {

            showAlert("Quantity must be numeric.");

        }

    }

    @FXML
    private void viewSummaryOA() {

        if (stock == null) {
            showAlert("Please search a stock record first.");
            return;
        }

        txtSummary.setText(
                "========== WAREHOUSE STOCK REPORT ==========\n\n" +
                        "Stock ID : " + stock.getStockId() + "\n\n" +
                        "Mango Variety : " + stock.getVariety() + "\n\n" +
                        "Warehouse Section : " + stock.getSection() + "\n\n" +
                        "Available Quantity : " + stock.getQuantity() + " Kg\n\n" +
                        "Stock Status : " + stock.getStatus()
        );

    }

    @FXML
    private void clearFormOA() {

        txtStockId.clear();
        txtVariety.clear();
        txtSection.clear();
        txtQuantity.clear();
        txtStatus.clear();
        txtSummary.clear();

        stock = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("OwnerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) txtStockId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Warehouse Stock");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}