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
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void placemangoorderButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/MangoOrdersView.fxml");
    }

    public void CheckMangoAvailabilityButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/MangoAvailabilityView.fxml");
    }

    public void PurchaseHistoryButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/PurchaseHistoryView.fxml");
    }

    public void OnlinePaymentButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/OnlinePaymentView.fxml");
    }

    public void ProductReviewOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/ProductReviewsView.fxml");
    }

    public void DownloadinvoiceButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/DownloadPaymentView.fxml");
    }

    public void CancelOrderbuttonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/CancelOrdersView.fxml");
    }

    public void TrackDeliveryButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/TrackDeliveryView.fxml");
    }

    public void NextButtonOA(ActionEvent event) {

        // Change this to the next page you want
        loadScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/Product ReviewsView.fxml");
    }

    public void BackButtonOA(ActionEvent event) {

        // Change this to the previous page you want
        loadScene(event,
                "/com/example/mangogardenestate/customerdashboard.fxml");
    }

    public void LogoutButtonOA(ActionEvent event) {
        loadScene(event,
                "/com/example/mangogardenestate/LoginView.fxml");
    }

}