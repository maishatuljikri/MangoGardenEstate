package com.example.mangogardenestate.maisha2330841.customer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CancelOrdersViewController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        reasonComboBox.getItems().addAll(
                "Changed My Mind",
                "Wrong Order",
                "Delivery Delay",
                "Ordered by Mistake",
                "Other"
        );

        statusLabel.setText("Pending");
        cancelDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void submitButtonOA() {

        if (orderIdField.getText().isEmpty()
                || reasonComboBox.getValue() == null
                || cancelDatePicker.getValue() == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }

        System.out.println("Order ID: " + orderIdField.getText());
        System.out.println("Status: Cancelled");
        System.out.println("Cancel Date: " + cancelDatePicker.getValue());
        System.out.println("Reason: " + reasonComboBox.getValue());
        System.out.println("Comments: " + commentsArea.getText());

        statusLabel.setText("Cancelled");

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Order cancelled successfully.");
    }

    @FXML
    private void clearButtonOA() {

        orderIdField.clear();
        statusLabel.setText("Pending");
        cancelDatePicker.setValue(LocalDate.now());
        reasonComboBox.getSelectionModel().clearSelection();
        commentsArea.clear();
        messageLabel.setText("");
    }

    @FXML
    public void backOnActionButton(ActionEvent actionEvent) {
        try {
            URL fxmlUrl = getClass().getResource(
                    "/com/example/mangogardenestate/maisha2330841/customer_controller/CustomerDashboard.fxml");

            if (fxmlUrl == null) {
                throw new IOException("CustomerDashboard.fxml not found on classpath.");
            }

            FXMLLoader loader = new FXMLLoader(fxmlUrl);
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

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