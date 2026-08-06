package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

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

        loginInfo.setText("Please contact the administrator.");
    }




    @FXML
    public void createAccount(ActionEvent event) {

        if (userField.getText().isEmpty()
                || password.getText().isEmpty()
                || confirmPassword.getText().isEmpty()) {

            createInfo.setText("Please fill all fields!");
            return;
        }

        if (!password.getText().equals(confirmPassword.getText())) {

            createInfo.setText("Passwords do not match!");
            return;
        }

        createInfo.setStyle("-fx-text-fill: green;");
        createInfo.setText("Account Created Successfully!");

        userField.clear();
        password.clear();
        confirmPassword.clear();
    }

    @FXML
    public void Login(ActionEvent event) throws IOException {

        if (userComboBox.getValue() == null || passLogIn.getText().isEmpty()) {

            loginInfo.setText("Please select user and enter password.");
            return;
        }

        String role = userComboBox.getValue();
        String pass = passLogIn.getText();

        if (!pass.equals("123")) {

            loginInfo.setText("Invalid Password");
            return;
        }

        FXMLLoader loader = null;

        switch (role) {

            case "Estate Owner":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/estateownerdashboard.fxml"));
                break;

            case "Garden Manager":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/gardenmanagerdashboard.fxml"));
                break;

            case "Farmer":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/farmerdeshboard.fxml"));
                break;

            case "Customer":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/customerdeshboard.fxml"));
                break;

            case "Accountant":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/accountantdashboard.fxml"));
                break;

            case "Transport Officer":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/transportofficerdashboard.fxml"));
                break;

            case "Security Guard":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/securityguarddashboard.fxml"));
                break;

            case "Packaging Officer":
                loader = new FXMLLoader(getClass().getResource("/com/example/mangogardenestate/packagingofficerdashboard.fxml"));
                break;
        }

        if (loader != null) {

            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) loginInfo.getScene().getWindow();

            stage.setScene(scene);

            stage.show();
        }
    }
}