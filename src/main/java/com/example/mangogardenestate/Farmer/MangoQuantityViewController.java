package com.example.mangogardenestate.Farmer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MangoQuantityViewController implements Initializable {

    @FXML
    private DatePicker harvestDatePicker;

    @FXML
    private ComboBox<String> sectionComboBox;

    @FXML
    private TextField varietyField;

    @FXML
    private TextField quantityField;

    @FXML
    private ComboBox<String> gradeComboBox;

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

        gradeComboBox.getItems().addAll(
                "Grade A",
                "Grade B",
                "Grade C"
        );

        harvestDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void saveButtonOA() {

        String section = sectionComboBox.getValue();
        String variety = varietyField.getText();
        String quantity = quantityField.getText();
        String grade = gradeComboBox.getValue();
        String remarks = remarksArea.getText();
        LocalDate harvestDate = harvestDatePicker.getValue();

        if (harvestDate == null ||
                section == null ||
                variety.isEmpty() ||
                quantity.isEmpty() ||
                grade == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }

        try {

            double qty = Double.parseDouble(quantity);

            if (qty <= 0) {
                messageLabel.setStyle("-fx-text-fill:red;");
                messageLabel.setText("Quantity must be greater than zero.");
                return;
            }

            // Print data (Later save to ArrayList or file)
            System.out.println("Harvest Date : " + harvestDate);
            System.out.println("Section      : " + section);
            System.out.println("Variety      : " + variety);
            System.out.println("Quantity     : " + qty + " kg");
            System.out.println("Grade        : " + grade);
            System.out.println("Remarks      : " + remarks);

            messageLabel.setStyle("-fx-text-fill:green;");
            messageLabel.setText("Harvest record saved successfully.");

        } catch (NumberFormatException e) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Quantity must be a valid number.");
        }
    }

    @FXML
    private void clearButtonOA() {

        harvestDatePicker.setValue(LocalDate.now());
        sectionComboBox.getSelectionModel().clearSelection();
        varietyField.clear();
        quantityField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
        remarksArea.clear();
        messageLabel.setText("");
    }
}