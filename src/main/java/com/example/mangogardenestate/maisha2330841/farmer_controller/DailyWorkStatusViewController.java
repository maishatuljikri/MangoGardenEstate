package com.example.mangogardenestate.maisha2330841.farmer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class DailyWorkStatusViewController implements Initializable {

    @FXML
    private TextField workTitleField;

    @FXML
    private DatePicker workDatePicker;

    @FXML
    private TextField assignedTaskField;

    @FXML
    private TextArea workDetailsArea;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        statusComboBox.getItems().addAll(
                "Not Started",
                "In Progress",
                "Completed"
        );


        assignedTaskField.clear();

        workDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void saveButtonOA() {

        String title = workTitleField.getText();
        LocalDate date = workDatePicker.getValue();
        String task = assignedTaskField.getText();
        String details = workDetailsArea.getText();
        String status = statusComboBox.getValue();

        if (title.isEmpty()
                || date == null
                || details.isEmpty()
                || status == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }


        System.out.println("Work Title : " + title);
        System.out.println("Date       : " + date);
        System.out.println("Task       : " + task);
        System.out.println("Details    : " + details);
        System.out.println("Status     : " + status);

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Work status saved successfully!");
    }

    @FXML
    private void clearButtonOA() {

        workTitleField.clear();
        workDatePicker.setValue(LocalDate.now());
        workDetailsArea.clear();
        statusComboBox.getSelectionModel().clearSelection();
        messageLabel.setText("");
    }

    @FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }
}