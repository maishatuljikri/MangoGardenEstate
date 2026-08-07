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
import java.net.URL;

/** Navigation shared by the two role dashboards. */
public abstract class RoleDashboardController {
    protected abstract String resourceFolder();

    @FXML public void openView(ActionEvent event) {
        Button button = (Button) event.getSource();
        String fileName = button.getId() + ".fxml";
        URL resourceUrl = resolveResource(resourceFolder() + "/" + fileName);
        if (resourceUrl == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Could not open " + fileName + ".");
            alert.showAndWait();
            return;
        }
        try {
            FXMLLoader loader = new FXMLLoader(resourceUrl);
            Parent root = loader.load();
            Stage stage = (Stage) button.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Could not open " + fileName + ".");
            alert.showAndWait();
        }
    }

    private URL resolveResource(String resourcePath) {
        URL resource = getClass().getResource(resourcePath);
        if (resource != null) return resource;

        String fallback = resourcePath
                .replace("/com/example/mangogardenestate/Security Guard/", "/com/example/mangogardenestate/Fahim2330569/Security Guard/")
                .replace("/com/example/mangogardenestate/Packaging Officer/", "/com/example/mangogardenestate/Fahim2330569/Packaging Officer/");
        return getClass().getResource(fallback);
    }
}
