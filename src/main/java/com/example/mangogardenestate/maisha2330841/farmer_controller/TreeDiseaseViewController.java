package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.maisha2330841.nonuser.TreeDisease;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
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

    private final String FILE_NAME = "TreeDisease.bin";

    private ArrayList<TreeDisease> diseaseList = new ArrayList<>();

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

        loadData();
    }

    @FXML
    private void submitButtonOA(ActionEvent event) {

        if (treeIdField.getText().trim().isEmpty()
                || sectionComboBox.getValue() == null
                || reportDatePicker.getValue() == null
                || diseaseTypeComboBox.getValue() == null
                || severityComboBox.getValue() == null
                || descriptionArea.getText().trim().isEmpty()) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all fields.");
            return;
        }

        TreeDisease disease = new TreeDisease(
                treeIdField.getText(),
                sectionComboBox.getValue(),
                reportDatePicker.getValue(),
                diseaseTypeComboBox.getValue(),
                severityComboBox.getValue(),
                descriptionArea.getText()
        );

        diseaseList.add(disease);

        saveData();

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Disease report submitted successfully.");

        clearFields();
    }

    @Deprecated
    private void clearButtonOA(ActionEvent event) {

        clearFields();
    }

    private void clearFields() {

        treeIdField.clear();

        sectionComboBox.getSelectionModel().clearSelection();

        reportDatePicker.setValue(LocalDate.now());

        diseaseTypeComboBox.getSelectionModel().clearSelection();

        severityComboBox.getSelectionModel().clearSelection();

        descriptionArea.clear();

        messageLabel.setText("");
    }

    private void saveData() {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(diseaseList);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            diseaseList = (ArrayList<TreeDisease>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

    @FXML
    private void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/example/mangogardenestate/farmerdeshboard.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Farmer Dashboard");
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Cannot open Farmer Dashboard.");
            alert.showAndWait();
        }
    }

    @FXML
    public void clearButtonButtonOA(ActionEvent actionEvent) {
    }
}