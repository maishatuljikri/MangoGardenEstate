package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class RequestLeaveViewController implements Initializable {

    @FXML
    private TextField farmerIdField;

    @FXML
    private ComboBox<String> leaveTypeComboBox;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private TextArea reasonArea;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        leaveTypeComboBox.getItems().addAll(
                "Casual Leave",
                "Sick Leave",
                "Emergency Leave",
                "Annual Leave"
        );

        statusComboBox.getItems().add("Pending");
        statusComboBox.setValue("Pending");

        startDatePicker.setValue(LocalDate.now());
        endDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void submitButtonOA() {

        String farmerId = farmerIdField.getText();
        String leaveType = leaveTypeComboBox.getValue();
        LocalDate startDate = startDatePicker.getValue();
        LocalDate endDate = endDatePicker.getValue();
        String reason = reasonArea.getText();
        String status = statusComboBox.getValue();

        if (farmerId.isEmpty() ||
                leaveType == null ||
                startDate == null ||
                endDate == null ||
                reason.isEmpty()) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }

        if (endDate.isBefore(startDate)) {
            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("End date cannot be before start date.");
            return;
        }

        // Print data (Later you can save to ArrayList or file)
        System.out.println("Farmer ID : " + farmerId);
        System.out.println("Leave Type: " + leaveType);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date  : " + endDate);
        System.out.println("Reason    : " + reason);
        System.out.println("Status    : " + status);

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Leave request submitted successfully.");
    }

    @FXML
    private void clearButtonOA() {

        farmerIdField.clear();
        leaveTypeComboBox.getSelectionModel().clearSelection();

        startDatePicker.setValue(LocalDate.now());
        endDatePicker.setValue(LocalDate.now());

        reasonArea.clear();

        statusComboBox.setValue("Pending");

        messageLabel.setText("");
    }

    @FXML
    public void backButtonOA(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/example/mangogardenestate/farmerdeshboard.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}