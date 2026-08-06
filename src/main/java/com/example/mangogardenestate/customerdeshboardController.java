package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class customerdeshboardController {

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void placemangoorderButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/MangoOrdersView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Place Mango Order");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void CheckMangoAvailabilityButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/MangoAvailabilityView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Mango Availability");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void PurchaseHistoryButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/PurchaseHistoryView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Purchase History");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void OnlinePaymentButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/OnlinePaymentView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Online Payment");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void ProductReviewOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/ProductReviewsView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Product Review");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void DownloadinvoiceButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/DownloadPaymentView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Download Payment Invoice");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void CancelOrderbuttonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/CancelOrdersView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Cancel Order");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void TrackDeliveryButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/maisha2330841/customer_controller/TrackDeliveryView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Track Delivery");
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void LogoutButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/example/mangogardenestate/LoginView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setTitle("Login");

        stage.setScene(scene);
    }

}