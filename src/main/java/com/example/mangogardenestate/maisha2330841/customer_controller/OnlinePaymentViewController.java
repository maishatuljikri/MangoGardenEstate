package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.HelloApplication;
import com.example.mangogardenestate.maisha2330841.nonuser.OnlinePayment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class OnlinePaymentViewController {

    @FXML
    private TextField orderIdTF;

    @FXML
    private TextField TotalamountTF;

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private TextField accountNumberTF;

    @FXML
    private TextField holderNameTF;

    @FXML
    private PasswordField pinTF;

    @FXML
    private DatePicker paymentDatePicker;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {

        paymentMethodComboBox.getItems().addAll(
                "bKash",
                "Nagad",
                "Rocket",
                "Visa Card",
                "MasterCard"
        );

        TotalamountTF.setText("1500");
    }

    @FXML
    private void payButtonOA(ActionEvent event) {

        if (orderIdTF.getText().isEmpty()
                || TotalamountTF.getText().isEmpty()
                || paymentMethodComboBox.getValue() == null
                || accountNumberTF.getText().isEmpty()
                || holderNameTF.getText().isEmpty()
                || pinTF.getText().isEmpty()
                || paymentDatePicker.getValue() == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all fields.");
            return;
        }

        OnlinePayment payment = new OnlinePayment(
                orderIdTF.getText(),
                Double.parseDouble(TotalamountTF.getText()),
                paymentMethodComboBox.getValue(),
                accountNumberTF.getText(),
                holderNameTF.getText(),
                pinTF.getText(),
                paymentDatePicker.getValue()
        );

        System.out.println(payment);

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Payment Successful!");
    }

    @FXML
    private void clearButtonOA(ActionEvent event) {

        orderIdTF.clear();
        TotalamountTF.clear();
        paymentMethodComboBox.getSelectionModel().clearSelection();
        accountNumberTF.clear();
        holderNameTF.clear();
        pinTF.clear();
        paymentDatePicker.setValue(null);
        messageLabel.setText("");
    }

    @FXML
    public void backButtonOA(ActionEvent event) {

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