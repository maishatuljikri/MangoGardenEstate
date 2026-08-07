package com.example.mangogardenestate.maisha2330841.customer_controller;

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

        deliveryList.add(new TrackDelivery(
                "O101",
                "D001",
                "Dhaka",
                "10-08-2026",
                "On the Way",
                "Rahim"
        ));

        deliveryList.add(new TrackDelivery(
                "O102",
                "D002",
                "Gazipur",
                "12-08-2026",
                "Delivered",
                "Karim"
        ));

        deliveryTable.setItems(deliveryList);
    }

    @FXML
    private void searchButtonOA(ActionEvent event) {

        String id = orderIdField.getText().trim();

        if (id.isEmpty()) {
            deliveryTable.setItems(deliveryList);
            return;
        }

        ObservableList<TrackDelivery> result =
                FXCollections.observableArrayList();

        for (TrackDelivery t : deliveryList) {
            if (t.getOrderId().equalsIgnoreCase(id)) {
                result.add(t);
            }
        }

        deliveryTable.setItems(result);

        if (result.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Search");
            alert.setHeaderText(null);
            alert.setContentText("No Order Found.");
            alert.showAndWait();
        }
    }

    @FXML
    private void refreshButtonOA(ActionEvent event) {

        deliveryTable.setItems(deliveryList);
        deliveryTable.refresh();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Delivery Status Refreshed.");
        alert.showAndWait();
    }

    @FXML
    private void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/mangogardenestate/customerdeshboard.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Customer Dashboard could not be opened.");
            alert.showAndWait();
        }
    }
}