package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.HelloApplication;
import com.example.mangogardenestate.maisha2330841.nonuser.PurchaseHistory;
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

public class PurchaseHistoryViewController {

    @FXML
    private TextField customerIdField;

    @FXML
    private TextField customerNameField;

    @FXML
    private TableView<PurchaseHistory> purchaseTable;

    @FXML
    private TableColumn<PurchaseHistory, String> orderIdColumn;

    @FXML
    private TableColumn<PurchaseHistory, String> orderDateColumn;

    @FXML
    private TableColumn<PurchaseHistory, String> mangoTypeColumn;

    @FXML
    private TableColumn<PurchaseHistory, Double> quantityColumn;

    @FXML
    private TableColumn<PurchaseHistory, Double> amountColumn;

    @FXML
    private TableColumn<PurchaseHistory, String> paymentStatusColumn;

    @FXML
    private TableColumn<PurchaseHistory, String> deliveryStatusColumn;

    private final ObservableList<PurchaseHistory> purchaseList =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        orderDateColumn.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
        mangoTypeColumn.setCellValueFactory(new PropertyValueFactory<>("mangoType"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentStatusColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        deliveryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryStatus"));

        purchaseTable.setItems(purchaseList);
    }

    @FXML
    private void generateReportButton(ActionEvent event) {

        if (customerIdField.getText().trim().isEmpty()
                || customerNameField.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please enter Customer ID and Customer Name.");
            alert.showAndWait();
            return;
        }


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Report generated successfully.");
        alert.showAndWait();
    }

    @FXML
    private void downloadReportButton(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Report downloaded successfully.");
        alert.showAndWait();
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