package com.example.mangogardenestate.Customer;

import com.example.mangogardenestate.ModelClass2.ProductReview;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProductReviewViewController {

    @FXML
    private TextField customerIdField;

    @FXML
    private ComboBox<String> orderIdComboBox;

    @FXML
    private ComboBox<String> mangoComboBox;

    @FXML
    private ComboBox<String> ratingComboBox;

    @FXML
    private TextArea reviewTA;

    @FXML
    private DatePicker reviewDatePicker;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {

        orderIdComboBox.getItems().addAll(
                "ORD001",
                "ORD002",
                "ORD003",
                "ORD004"
        );

        mangoComboBox.getItems().addAll(
                "Haribhanga",
                "Langra",
                "Himsagar",
                "Amrapali",
                "Fazli"
        );

        ratingComboBox.getItems().addAll(
                "1 Star",
                "2 Stars",
                "3 Stars",
                "4 Stars",
                "5 Stars"
        );
    }

    @FXML
    private void submitButton(ActionEvent event) {

        if (customerIdField.getText().isEmpty()
                || orderIdComboBox.getValue() == null
                || mangoComboBox.getValue() == null
                || ratingComboBox.getValue() == null
                || reviewTA.getText().isEmpty()
                || reviewDatePicker.getValue() == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all fields.");
            return;
        }

        ProductReview review = new ProductReview(
                customerIdField.getText(),
                orderIdComboBox.getValue(),
                mangoComboBox.getValue(),
                ratingComboBox.getValue(),
                reviewTA.getText(),
                reviewDatePicker.getValue()
        );

        System.out.println(review);

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Review submitted successfully!");
    }

    @FXML
    private void clearButton(ActionEvent event) {

        customerIdField.clear();
        orderIdComboBox.getSelectionModel().clearSelection();
        mangoComboBox.getSelectionModel().clearSelection();
        ratingComboBox.getSelectionModel().clearSelection();
        reviewTA.clear();
        reviewDatePicker.setValue(null);
        messageLabel.setText("");
    }
}