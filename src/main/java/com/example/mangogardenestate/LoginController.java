package com.example.mangogardenestate;

import com.example.mangogardenestate.maisha2330841.nonuser.CancelOrder;
import com.example.mangogardenestate.utility.SceneSwitchingHelper;
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
    private Label messageLabel;

    @FXML
    public void initialize() {


    }

    @FXML
    private void loginButtonOA() {

        String username = usernameTF.getText();
        String password = passwordPF.getText();


        if (username.isEmpty()) {
            messageLabel.setText("Enter Username");
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

        messageLabel.setText("");

    }


}