package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.HelloApplication;
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
    public void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/example/mangogardenestate/farmerdeshboard.fxml"));

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
            alert.setContentText("farmerdeshboard.fxml not found.");
            alert.showAndWait();
        }
    }
}