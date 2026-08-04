package com.example.mangogardenestate;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private ComboBox<String> cmbRole;

    @FXML public void initialize() {
        cmbRole.getItems().addAll("Security Guard", "Packaging Officer");
    }

    @FXML private void login() {
        if (txtUsername.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty() || cmbRole.getValue() == null) {
            showAlert(Alert.AlertType.WARNING, "Enter username, password, and select a role.");
            return;
        }
        String page = cmbRole.getValue().equals("Security Guard")
                ? "/com/example/mangogardenestate/Security Guard/SecurityGuardDashboard.fxml"
                : "/com/example/mangogardenestate/Packaging Officer/PackagingOfficerDashboard.fxml";
        try {
            Parent root = FXMLLoader.load(getClass().getResource(page));
            Stage stage = (Stage) txtUsername.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            showAlert(Alert.AlertType.ERROR, "Could not open the dashboard.");
        }
    }

    private void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type, message);
        alert.setHeaderText(null);
        alert.showAndWait();
    }
}
