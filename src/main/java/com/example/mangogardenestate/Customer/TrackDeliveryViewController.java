package com.example.mangogardenestate.Customer;

import com.example.mangogardenestate.ModelClass2.TrackDelivery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private void backButtonOA(ActionEvent event) {

        orderIdField.clear();
        deliveryList.clear();

        System.out.println("Back button clicked.");
    }
}