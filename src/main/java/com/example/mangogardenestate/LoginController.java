package com.example.mangogardenestate;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameTF;

    @FXML
    private PasswordField passwordPF;

    @FXML
    private ComboBox<String> roleCB;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {

        roleCB.setItems(FXCollections.observableArrayList(
                "Estate Owner",
                "Garden Manager",
                "Farmer",
                "Customer",
                "Accountant",
                "Transport Officer",
                "Security Guard",
                "Packaging Officer"
        ));
    }

    @FXML
    private void loginButtonOA() {

        String username = usernameTF.getText();
        String password = passwordPF.getText();
        String role = roleCB.getValue();

        if (username.isEmpty()) {
            messageLabel.setText("Enter Username");
            return;
        }

        if (role == null) {
            messageLabel.setText("Select User Role");
            return;
        }

        if (password.isEmpty()) {
            messageLabel.setText("Enter Password");
            return;
        }

        messageLabel.setStyle("-fx-text-fill: green;");
        messageLabel.setText("Login Successful");
    }

    @FXML
    private void clearButtonOA() {

        usernameTF.clear();
        passwordPF.clear();
        roleCB.getSelectionModel().clearSelection();
        messageLabel.setText("");

    }
}