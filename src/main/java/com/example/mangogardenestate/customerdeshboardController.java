package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class customerdeshboardController {

    private void changeScene(ActionEvent event, String fileName) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Scene Loading Error");
            alert.setHeaderText("Cannot load FXML");
            alert.setContentText(fileName);
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
    public void OnlinePaymentButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/OnlinePaymentView.fxml");
    }

    @FXML
    public void CancelOrderbuttonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/CancelOrdersView.fxml");
    }

    @FXML
    public void PurchaseHistoryButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/Purchase HistoryView.fxml");
    }

    @FXML
    public void ProductReviewOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/Product ReviewsView.fxml");
    }

    @FXML
    public void DownloadinvoiceButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/DownloadInvoice.fxml");
    }

    @FXML
    public void TrackDeliveryButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/maisha2330841/customer_controller/Track DeliveryView.fxml");
    }

    @FXML
    public void LogoutButtonOA(ActionEvent event) {
        changeScene(event,
                "/com/example/mangogardenestate/LoginView.fxml");
    }
}