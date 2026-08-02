package com.example.mangogardenestate.maisha2330841.customer_controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DownloadInvoiceController implements Initializable {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextField invoiceIdField;

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField paymentAmountField;

    @FXML
    private TextField paymentDateField;

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        paymentMethodComboBox.getItems().addAll(
                "Cash",
                "Credit Card",
                "Debit Card",
                "Mobile Banking",
                "Bank Transfer"
        );
    }

    @FXML
    private void generatePdfButtonOA() {

        messageLabel.setText("PDF generated successfully.");

        System.out.println("Generate PDF");
    }

    @FXML
    private void downloadButtonOA() {

        messageLabel.setText("Invoice downloaded successfully.");

        System.out.println("Download Invoice");
    }

    @FXML
    private void backButtonOA() {

        messageLabel.setText("Back to dashboard.");

        System.out.println("Back");
    }

}