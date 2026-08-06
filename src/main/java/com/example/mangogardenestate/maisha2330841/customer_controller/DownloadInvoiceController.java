package com.example.mangogardenestate.maisha2330841.customer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    private void generatePdfButtonOA(ActionEvent event) {

        messageLabel.setText("PDF generated successfully.");
    }

    @FXML
    private void downloadButtonOA(ActionEvent event) {

        messageLabel.setText("Invoice downloaded successfully.");
    }

    @FXML
    private void backButtonOA(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/example/mangogardenestate/customerdeshboard.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Scene Error");
            alert.setHeaderText(null);
            alert.setContentText("CustomerDashboard.fxml not found.");
            alert.showAndWait();
        }
    }
}