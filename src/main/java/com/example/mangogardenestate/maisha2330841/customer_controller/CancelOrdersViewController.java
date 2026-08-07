package com.example.mangogardenestate.maisha2330841.customer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class CancelOrdersViewController {

    @FXML
    private TextField orderIdField;

    @FXML
    private Label statusLabel;

    @FXML
    private DatePicker cancelDatePicker;

    @FXML
    private ComboBox<String> reasonComboBox;

    @FXML
    private TextArea commentsArea;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {

        reasonComboBox.getItems().addAll(
                "Changed My Mind",
                "Ordered by Mistake",
                "Found Better Price",
                "Delivery Delay",
                "Other"
        );

        cancelDatePicker.setValue(LocalDate.now());
        statusLabel.setText("Pending");
    }

    @FXML
    private void submitButtonOA(ActionEvent event) {

        if (orderIdField.getText().isBlank()
                || cancelDatePicker.getValue() == null
                || reasonComboBox.getValue() == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }

        statusLabel.setText("Cancelled");

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Order cancelled successfully.");
    }

    @FXML
    private void ClearButtonOA(ActionEvent event) {

        orderIdField.clear();
        cancelDatePicker.setValue(LocalDate.now());
        reasonComboBox.getSelectionModel().clearSelection();
        commentsArea.clear();

        statusLabel.setText("Pending");
        messageLabel.setText("");
    }

    @FXML
    private void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/mangogardenestate/customerdeshboard.fxml"));

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
            alert.setContentText("Cannot open Customer Dashboard.");
            alert.showAndWait();
        }
    }
}