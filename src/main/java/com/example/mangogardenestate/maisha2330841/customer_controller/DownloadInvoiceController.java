package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
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
    private void backButtonOA(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/example/mangogardenestate/maisha2330841/customer_controller/CancelOrdersView.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}