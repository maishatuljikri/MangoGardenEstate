package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.HelloApplication;
import com.example.mangogardenestate.maisha2330841.nonuser.TrackDelivery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class TrackDeliveryViewController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TableView<TrackDelivery> deliveryTable;

    @FXML
    private TableColumn<TrackDelivery, String> orderIdColumn;

    @FXML
    private TableColumn<TrackDelivery, String> deliveryIdColumn;

    @FXML
    private TableColumn<TrackDelivery, String> addressColumn;

    @FXML
    private TableColumn<TrackDelivery, String> deliveryDateColumn;

    @FXML
    private TableColumn<TrackDelivery, String> statusColumn;

    @FXML
    private TableColumn<TrackDelivery, String> deliveryPersonColumn;

    private final ObservableList<TrackDelivery> deliveryList =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        deliveryIdColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        deliveryDateColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        deliveryPersonColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryPerson"));

        deliveryTable.setItems(deliveryList);
    }

    @FXML
    private void searchButtonOA(ActionEvent event) {

        String orderId = orderIdField.getText().trim();

        if (orderId.isEmpty()) {
            System.out.println("Please enter Order ID.");
            return;
        }

        // TODO:
        // Read delivery data from your .bin file or database.
        // Filter by orderId and add matching objects to deliveryList.

        System.out.println("Searching for Order ID: " + orderId);
    }

    @FXML
    private void refreshButtonOA(ActionEvent event) {

        deliveryTable.refresh();

        System.out.println("Delivery status refreshed.");
    }

    @FXML
    public void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/example/mangogardenestate/customerdeshboard.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Scene Error");
            alert.setHeaderText(null);
            alert.setContentText("CustomerDashboard.fxml not found.");
            alert.showAndWait();
        }
    }
}