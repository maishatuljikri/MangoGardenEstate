package com.example.mangogardenestate.maisha2330841.customer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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

        mangoComboBox.setOnAction(e -> {

            String mango = mangoComboBox.getValue();

            switch (mango) {

                case "Haribhanga":
                    priceField.setText("180");
                    stockField.setText("100");
                    break;

                case "Langra":
                    priceField.setText("200");
                    stockField.setText("80");
                    break;

                case "Himsagar":
                    priceField.setText("220");
                    stockField.setText("60");
                    break;

                case "Amrapali":
                    priceField.setText("170");
                    stockField.setText("120");
                    break;

                case "Fazli":
                    priceField.setText("160");
                    stockField.setText("150");
                    break;
            }
        });
    }

    @FXML
    private void placeOrderButtonOA(ActionEvent event) {

        if (customerIdField.getText().isEmpty()
                || mangoComboBox.getValue() == null
                || quantityField.getText().isEmpty()
                || deliveryDatePicker.getValue() == null
                || addressArea.getText().isEmpty()) {

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
        mangoComboBox.setValue(null);
        priceField.clear();
        stockField.clear();
        quantityField.clear();
        deliveryDatePicker.setValue(null);
        addressArea.clear();
        messageLabel.setText("");
    }

    @FXML
    public void BackButtonOA(ActionEvent actionEvent) {
    }
}