package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class customerdeshboardController {

    private void loadScene(ActionEvent event, String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void placemangoorderButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/MangoOrdersView.fxml");
    }

    public void CheckMangoAvailabilityButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/MangoAvailabilityView.fxml");
    }

    public void PurchaseHistoryButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/PurchaseHistoryView.fxml");
    }

    public void OnlinePaymentButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/OnlinePaymentView.fxml");
    }

    public void ProductReviewOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/ProductReviewView.fxml");
    }

    public void DownloadinvoiceButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/DownloadInvoiceView.fxml");
    }

    public void CancelOrderbuttonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/CancelOrdersView.fxml");
    }

    public void TrackDeliveryButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/TrackDeliveryView.fxml");
    }

    public void NextButtonOA(ActionEvent event) {
        System.out.println("Next button clicked.");
    }

    public void BackButtonOA(ActionEvent event) {
        System.out.println("Back button clicked.");
    }

    public void LogoutButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/LoginView.fxml");
    }
}