package com.example.mangogardenestate.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PurchaseHistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn mangoTypeColumn;
    @javafx.fxml.FXML
    private TableColumn orderIdColumn;
    @javafx.fxml.FXML
    private TableColumn orderDateColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn deliveryStatusColumn;
    @javafx.fxml.FXML
    private TableColumn quantityColumn;
    @javafx.fxml.FXML
    private TableColumn paymentStatusColumn;
    @javafx.fxml.FXML
    private TextField customerNameField;
    @javafx.fxml.FXML
    private TableView purchaseTable;
    @javafx.fxml.FXML
    private TextField customerIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
    }
}