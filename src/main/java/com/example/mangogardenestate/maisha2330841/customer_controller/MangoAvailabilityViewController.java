package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.HelloApplication;
import com.example.mangogardenestate.maisha2330841.nonuser.MangoAvailability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MangoAvailabilityViewController implements Initializable {

    @FXML
    private TextField MangoTypeTF;

    @FXML
    private TableView<MangoAvailability> stockTable;

    @FXML
    private TableColumn<MangoAvailability, String> mangoIdColumn;

    @FXML
    private TableColumn<MangoAvailability, String> varietyColumn;

    @FXML
    private TableColumn<MangoAvailability, String> priceColumn;

    @FXML
    private TableColumn<MangoAvailability, String> stockColumn;

    @FXML
    private TableColumn<MangoAvailability, String> harvestDateColumn;

    @FXML
    private TableColumn<MangoAvailability, String> statusColumn;

    private final ObservableList<MangoAvailability> mangoList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("Initialize Running");

        mangoIdColumn.setCellValueFactory(new PropertyValueFactory<>("mangoId"));
        varietyColumn.setCellValueFactory(new PropertyValueFactory<>("variety"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        stockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        harvestDateColumn.setCellValueFactory(new PropertyValueFactory<>("harvestDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        mangoList.add(new MangoAvailability("M001","Langra","250","120 Kg","10/07/2026","Available"));
        mangoList.add(new MangoAvailability("M002","Haribhanga","220","80 Kg","11/07/2026","Available"));
        mangoList.add(new MangoAvailability("M003","Himsagar","300","0 Kg","09/07/2026","Out of Stock"));
        mangoList.add(new MangoAvailability("M004","Fazli","200","60 Kg","08/07/2026","Available"));

        stockTable.setItems(mangoList);

        System.out.println(stockTable.getItems().size());
    }

    @FXML
    private void searchButton() {

        String search = MangoTypeTF.getText().trim().toLowerCase();

        if (search.isEmpty()) {
            stockTable.setItems(mangoList);
            return;
        }

        ObservableList<MangoAvailability> filtered =
                FXCollections.observableArrayList();

        for (MangoAvailability m : mangoList) {

            if (m.getVariety().toLowerCase().contains(search)
                    || m.getMangoId().toLowerCase().contains(search)
                    || m.getStatus().toLowerCase().contains(search)) {

                filtered.add(m);
            }
        }

        stockTable.setItems(filtered);
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