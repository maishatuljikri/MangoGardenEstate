package com.example.mangogardenestate.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/** Navigation shared by the two role dashboards. */
public abstract class RoleDashboardController {
    protected abstract String resourceFolder();

    @FXML public void openView(ActionEvent event) {
        Button button = (Button) event.getSource();
        String fileName = button.getId() + ".fxml";
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resourceFolder() + "/" + fileName));
            Parent root = loader.load();
            Stage stage = (Stage) button.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException | NullPointerException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Could not open " + fileName + ".");
            alert.showAndWait();
        }
    }
}
