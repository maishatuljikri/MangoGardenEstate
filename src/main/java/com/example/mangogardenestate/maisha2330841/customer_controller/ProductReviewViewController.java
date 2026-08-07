package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.maisha2330841.nonuser.ProductReview;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

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

    @FXML
    public void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/example/mangogardenestate/customerdashboard.fxml"));

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