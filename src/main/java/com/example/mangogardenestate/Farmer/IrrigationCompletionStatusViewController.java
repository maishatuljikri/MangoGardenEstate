package com.example.mangogardenestate.Farmer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class IrrigationCompletionStatusViewController implements Initializable {

    @FXML
    private TextField irrigationIdField;

    @FXML
    private ComboBox<String> sectionComboBox;

    @FXML
    private DatePicker irrigationDatePicker;

    @FXML
    private TextField durationField;

    @FXML
    private TextField waterAmountField;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private TextArea remarksArea;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sectionComboBox.getItems().addAll(
                "Section A",
                "Section B",
                "Section C",
                "Section D"
        );

        statusComboBox.getItems().addAll(
                "Completed",
                "Partially Completed",
                "Pending"
        );

        irrigationDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void saveButtonOA() {

        String irrigationId = irrigationIdField.getText();
        String section = sectionComboBox.getValue();
        LocalDate date = irrigationDatePicker.getValue();
        String duration = durationField.getText();
        String waterAmount = waterAmountField.getText();
        String status = statusComboBox.getValue();
        String remarks = remarksArea.getText();

        if (irrigationId.isEmpty()
                || section == null
                || date == null
                || duration.isEmpty()
                || waterAmount.isEmpty()
                || status == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }

        try {

            double hours = Double.parseDouble(duration);
            double liters = Double.parseDouble(waterAmount);

            if (hours <= 0 || liters <= 0) {
                messageLabel.setStyle("-fx-text-fill:red;");
                messageLabel.setText("Duration and water amount must be greater than zero.");
                return;
            }

            // Print values (Later save to ArrayList/File)
            System.out.println("Irrigation ID : " + irrigationId);
            System.out.println("Section       : " + section);
            System.out.println("Date          : " + date);
            System.out.println("Duration      : " + hours + " Hours");
            System.out.println("Water Used    : " + liters + " Liters");
            System.out.println("Status        : " + status);
            System.out.println("Remarks       : " + remarks);

            messageLabel.setStyle("-fx-text-fill:green;");
            messageLabel.setText("Irrigation status saved successfully.");

        } catch (NumberFormatException e) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Duration and Water Used must be numeric.");
        }
    }

    @FXML
    private void clearButtonOA() {

        irrigationIdField.clear();
        sectionComboBox.getSelectionModel().clearSelection();
        irrigationDatePicker.setValue(LocalDate.now());
        durationField.clear();
        waterAmountField.clear();
        statusComboBox.getSelectionModel().clearSelection();
        remarksArea.clear();
        messageLabel.setText("");
    }
}