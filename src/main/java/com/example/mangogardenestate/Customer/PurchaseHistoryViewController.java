package com.example.mangogardenestate.Customer;

import com.example.mangogardenestate.ModelClass2.PurchaseHistory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private void backButton(ActionEvent event) {

        customerIdField.clear();
        customerNameField.clear();
        purchaseList.clear();
    }
}