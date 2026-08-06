package com.example.mangogardenestate.maisha2330841.customer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MangoOrdersViewController {

    @FXML
    private TextField customerIdField;

    @FXML
    private ComboBox<String> mangoComboBox;

    @FXML
    private TextField priceField;

    @FXML
    private TextField stockField;

    @FXML
    private TextField quantityField;

    @FXML
    private DatePicker deliveryDatePicker;

    @FXML
    private TextArea addressArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {

        mangoComboBox.getItems().addAll(
                "Haribhanga",
                "Langra",
                "Himsagar",
                "Amrapali",
                "Fazli"
        );

        mangoComboBox.setOnAction(e -> updatePriceAndStock());
    }

    private void updatePriceAndStock() {

        String mango = mangoComboBox.getValue();

        if (mango == null) return;

        switch (mango) {

            case "Haribhanga":
                priceField.setText("180");
                stockField.setText("100 Kg");
                break;

            case "Langra":
                priceField.setText("200");
                stockField.setText("80 Kg");
                break;

            case "Himsagar":
                priceField.setText("220");
                stockField.setText("60 Kg");
                break;

            case "Amrapali":
                priceField.setText("170");
                stockField.setText("120 Kg");
                break;

            case "Fazli":
                priceField.setText("160");
                stockField.setText("150 Kg");
                break;
        }
    }

    @FXML
    private void placeOrderButtonOA(ActionEvent event) {

        if (customerIdField.getText().trim().isEmpty()
                || mangoComboBox.getValue() == null
                || quantityField.getText().trim().isEmpty()
                || deliveryDatePicker.getValue() == null
                || addressArea.getText().trim().isEmpty()) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all fields.");
            return;
        }

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Order placed successfully!");
    }

    @FXML
    private void clearButtonOA(ActionEvent event) {

        customerIdField.clear();
        mangoComboBox.getSelectionModel().clearSelection();
        priceField.clear();
        stockField.clear();
        quantityField.clear();
        deliveryDatePicker.setValue(null);
        addressArea.clear();
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