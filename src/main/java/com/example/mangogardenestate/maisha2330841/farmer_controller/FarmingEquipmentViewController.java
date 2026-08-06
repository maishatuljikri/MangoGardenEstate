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

public class FarmingEquipmentViewController implements Initializable {

    @FXML
    private ComboBox<String> equipmentComboBox;

    @FXML
    private TextField quantityField;

    @FXML
    private DatePicker requiredDatePicker;

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private TextArea purposeArea;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        equipmentComboBox.getItems().addAll(
                "Tractor",
                "Sprayer",
                "Water Pump",
                "Wheelbarrow",
                "Ladder",
                "Pruning Shears",
                "Fertilizer Spreader",
                "Harvest Basket"
        );

        priorityComboBox.getItems().addAll(
                "Low",
                "Medium",
                "High",
                "Urgent"
        );

        requiredDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void submitButtonOA() {

        String equipment = equipmentComboBox.getValue();
        String quantity = quantityField.getText();
        LocalDate date = requiredDatePicker.getValue();
        String priority = priorityComboBox.getValue();
        String purpose = purposeArea.getText();

        if (equipment == null ||
                quantity.isEmpty() ||
                date == null ||
                priority == null ||
                purpose.isEmpty()) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please complete all fields.");
            return;
        }

        try {
            int qty = Integer.parseInt(quantity);

            if (qty <= 0) {
                messageLabel.setStyle("-fx-text-fill:red;");
                messageLabel.setText("Quantity must be greater than 0.");
                return;
            }

            // Later you can save this to ArrayList or a file
            System.out.println("Equipment : " + equipment);
            System.out.println("Quantity  : " + qty);
            System.out.println("Date      : " + date);
            System.out.println("Priority  : " + priority);
            System.out.println("Purpose   : " + purpose);

            messageLabel.setStyle("-fx-text-fill:green;");
            messageLabel.setText("Equipment request submitted successfully.");

        } catch (NumberFormatException e) {
            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Quantity must be a number.");
        }
    }

    @FXML
    private void clearButtonOA() {

        equipmentComboBox.getSelectionModel().clearSelection();
        quantityField.clear();
        requiredDatePicker.setValue(LocalDate.now());
        priorityComboBox.getSelectionModel().clearSelection();
        purposeArea.clear();
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