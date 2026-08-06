package com.example.mangogardenestate.maisha2330841.farmer_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TreeDiseaseViewController implements Initializable {

    @FXML
    private TextField treeIdField;

    @FXML
    private ComboBox<String> sectionComboBox;

    @FXML
    private DatePicker reportDatePicker;

    @FXML
    private ComboBox<String> diseaseTypeComboBox;

    @FXML
    private ComboBox<String> severityComboBox;

    @FXML
    private TextArea descriptionArea;

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

        diseaseTypeComboBox.getItems().addAll(
                "Anthracnose",
                "Powdery Mildew",
                "Bacterial Black Spot",
                "Root Rot",
                "Leaf Spot"
        );

        severityComboBox.getItems().addAll(
                "Low",
                "Medium",
                "High"
        );

        reportDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void submitButtonOA() {

        String treeId = treeIdField.getText();
        String section = sectionComboBox.getValue();
        LocalDate reportDate = reportDatePicker.getValue();
        String disease = diseaseTypeComboBox.getValue();
        String severity = severityComboBox.getValue();
        String description = descriptionArea.getText();

        if (treeId.isEmpty()
                || section == null
                || reportDate == null
                || disease == null
                || severity == null
                || description.isEmpty()) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all fields.");
            return;
        }

        System.out.println("Tree ID: " + treeId);
        System.out.println("Section: " + section);
        System.out.println("Report Date: " + reportDate);
        System.out.println("Disease: " + disease);
        System.out.println("Severity: " + severity);
        System.out.println("Description: " + description);

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Disease report submitted successfully.");
    }

    @FXML
    private void clearButtonOA() {

        treeIdField.clear();

        sectionComboBox.getSelectionModel().clearSelection();

        reportDatePicker.setValue(LocalDate.now());

        diseaseTypeComboBox.getSelectionModel().clearSelection();

        severityComboBox.getSelectionModel().clearSelection();

        descriptionArea.clear();

        messageLabel.setText("");
    }

    @FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @FXML
    public void clearButtonButtonOA(ActionEvent actionEvent) {
    }
}