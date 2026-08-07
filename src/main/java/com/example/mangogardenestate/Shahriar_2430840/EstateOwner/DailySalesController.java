package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.EstateOwnerModelclass.DailySales;
import com.example.mangogardenestate.Util.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;

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

    private final String FILE_NAME = "DailySales.bin";

    private ArrayList<DailySales> salesList = new ArrayList<>();

    @FXML
    public void initialize() {
        loadData();
    }

    @FXML
    private void searchSalesOA() {

        if (txtSalesId.getText().isBlank()) {
            showAlert("Please enter Sales ID.");
            return;
        }

        for (DailySales s : salesList) {

            if (s.getSalesId().equals(txtSalesId.getText())) {

                sales = s;

                txtSalesDate.setText(s.getSalesDate());
                txtCustomerName.setText(s.getCustomerName());
                txtQuantity.setText(String.valueOf(s.getQuantity()));
                txtAmount.setText(String.valueOf(s.getAmount()));

                showAlert("Sales record found.");
                return;
            }
        }

        showAlert("Sales record not found.");
    }

    @FXML
    private void calculateSalesOA() {

        if (txtSalesId.getText().isBlank()
                || txtSalesDate.getText().isBlank()
                || txtCustomerName.getText().isBlank()
                || txtQuantity.getText().isBlank()
                || txtAmount.getText().isBlank()) {

            showAlert("Please fill all fields.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());
            double amount = Double.parseDouble(txtAmount.getText());

            sales = new DailySales(
                    txtSalesId.getText(),
                    txtSalesDate.getText(),
                    txtCustomerName.getText(),
                    quantity,
                    amount
            );

            salesList.add(sales);

            saveData();

            double pricePerKg = amount / quantity;

            txtSummary.setText(
                    "Sales Saved Successfully\n\n" +
                            "Customer : " + sales.getCustomerName() + "\n" +
                            "Quantity : " + quantity + " Kg\n" +
                            "Amount : " + amount + " Tk\n" +
                            "Price/Kg : " + String.format("%.2f", pricePerKg)
            );

            showAlert("Sales record saved.");

        } catch (NumberFormatException e) {

            showAlert("Quantity and Amount must be numeric.");

        }
    }

    @FXML
    private void viewSummaryOA() {

        if (sales == null) {

            showAlert("Search or save a record first.");
            return;
        }

        txtSummary.setText(
                "========== DAILY SALES REPORT ==========\n\n" +
                        "Sales ID : " + sales.getSalesId() + "\n\n" +
                        "Sales Date : " + sales.getSalesDate() + "\n\n" +
                        "Customer : " + sales.getCustomerName() + "\n\n" +
                        "Quantity : " + sales.getQuantity() + " Kg\n\n" +
                        "Amount : " + sales.getAmount() + " Tk"
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
    private void goBackOA(ActionEvent event) {

        SceneSwitcher.switchScene(
                event,
                "/com/example/mangogardenestate/estateownerdashboard.fxml",
                "Estate Owner Dashboard");
    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(salesList);

            oos.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists())
            return;

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            salesList = (ArrayList<DailySales>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Daily Sales");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();
    }
}