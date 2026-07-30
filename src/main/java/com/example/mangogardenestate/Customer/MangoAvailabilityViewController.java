package com.example.mangogardenestate.Customer;

import com.example.mangogardenestate.ModelClass2.MangoAvailability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    }

    @FXML
    private void searchButton() {

        String search = MangoTypeTF.getText().trim().toLowerCase();

        if(search.isEmpty()){
            stockTable.setItems(mangoList);
            return;
        }

        ObservableList<MangoAvailability> filtered =
                FXCollections.observableArrayList();

        for(MangoAvailability m : mangoList){
            if(m.getVariety().toLowerCase().contains(search)){
                filtered.add(m);
            }
        }

        stockTable.setItems(filtered);
    }

    @FXML
    private void backButtonOA() {
        System.out.println("Back Button Clicked");
    }
}