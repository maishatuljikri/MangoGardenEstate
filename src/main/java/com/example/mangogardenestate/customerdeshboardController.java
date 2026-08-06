package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class customerdeshboardController {

    private void changeScene(ActionEvent event, String fileName) {

        try {

            Parent root = FXMLLoader.load(getClass().getResource(fileName));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Scene Loading Error");
            alert.setContentText(fileName + " not found.");
            alert.showAndWait();
        }
    }

    @FXML
    public void placemangoorderButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/MangoOrdersView.fxml");
    }

    @FXML
    public void CheckMangoAvailabilityButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/MangoAvailabilityView.fxml");
    }

    @FXML
    public void PurchaseHistoryButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/PurchaseHistoryView.fxml");
    }

    @FXML
    public void OnlinePaymentButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/OnlinePaymentView.fxml");
    }

    @FXML
    public void ProductReviewOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/ProductReviewsView.fxml");
    }

    @FXML
    public void DownloadinvoiceButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/DownloadPaymentView.fxml");
    }

    @FXML
    public void CancelOrderbuttonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/CancelOrdersView.fxml");
    }

    @FXML
    public void TrackDeliveryButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/TrackDeliveryView.fxml");
    }

    @FXML
    public void NextButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/MangoOrdersView.fxml");
    }

    @FXML
    public void BackButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/customerdeshboard.fxml");
    }

    @FXML
    public void LogoutButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/LoginView.fxml");
    }
}