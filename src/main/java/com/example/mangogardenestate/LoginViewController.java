package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginViewController {

    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<String> userComboBox;

    @FXML
    private PasswordField passLogIn;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private Label loginInfo;

    @FXML
    private Label createInfo;

    @FXML
    private TextField userField;

    @FXML
    public void initialize() {

        userComboBox.getItems().addAll(
                "Estate Owner",
                "Garden Manager",
                "Farmer",
                "Customer",
                "Accountant",
                "Transport Officer",
                "Security Guard",
                "Packaging Officer"
        );
    }

    @FXML
    public void forgetPassword(ActionEvent event) {
        if (loginInfo != null) {
            loginInfo.setText("Please contact the administrator.");
        }
    }

    @FXML
    public void createAccount(ActionEvent event) {

        if (userField.getText().isEmpty()
                || password.getText().isEmpty()
                || confirmPassword.getText().isEmpty()) {

            if (createInfo != null) createInfo.setText("Please fill all fields!");
            return;
        }

        if (!password.getText().equals(confirmPassword.getText())) {

            if (createInfo != null) createInfo.setText("Passwords do not match!");
            return;
        }

        if (createInfo != null) {
            createInfo.setStyle("-fx-text-fill: green;");
            createInfo.setText("Account Created Successfully!");
        }

        userField.clear();
        password.clear();
        confirmPassword.clear();
    }

    @FXML
    public void Login(ActionEvent event) throws IOException {

        if (userComboBox.getValue() == null || passLogIn.getText().isEmpty()) {
            if (loginInfo != null) loginInfo.setText("Please select user and enter password.");
            return;
        }

        String role = userComboBox.getValue();
        String pass = passLogIn.getText();

        if (!pass.equals("123")) {
            if (loginInfo != null) loginInfo.setText("Invalid Password");
            return;
        }

        String fxmlPath = "";

        switch (role) {

            case "Estate Owner":
                fxmlPath = "/com/example/mangogardenestate/estateownerdashboard.fxml";
                break;

            case "Garden Manager":
                fxmlPath = "/com/example/mangogardenestate/gardenmanagerdashboard.fxml";
                break;

            case "Farmer":
                fxmlPath = "/com/example/mangogardenestate/farmerdeshboard.fxml";
                break;

            case "Customer":
                fxmlPath = "/com/example/mangogardenestate/customerdashboard.fxml";
                break;

            case "Accountant":
                fxmlPath = "/com/example/mangogardenestate/Sean_2412489/Accountant/accountantdashboard.fxml";
                break;

            case "Transport Officer":
                fxmlPath = "/com/example/mangogardenestate/Sean_2412489/Transport Officer/transportofficerdashboard.fxml";
                break;

            case "Security Guard":
                fxmlPath = "/com/example/mangogardenestate/securityguarddashboard.fxml";
                break;

            case "Packaging Officer":
                fxmlPath = "/com/example/mangogardenestate/packagingofficerdashboard.fxml";
                break;
        }

        URL fxmlUrl = getClass().getResource(fxmlPath);

        // Check if the file actually exists before trying to load it
        if (fxmlUrl == null) {
            System.err.println("CRITICAL ERROR: Cannot find FXML file at path: " + fxmlPath);
            if (loginInfo != null) loginInfo.setText("Error: FXML file not found!");
            return;
        }

        FXMLLoader loader = new FXMLLoader(fxmlUrl);
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) loginInfo.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}