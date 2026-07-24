package com.example.mangogardenestate.Farmer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class WorkScheduleViewController
{
    @javafx.fxml.FXML
    private TableColumn taskIdColumn;
    @javafx.fxml.FXML
    private TableColumn startTimeColumn;
    @javafx.fxml.FXML
    private TableColumn sectionColumn;
    @javafx.fxml.FXML
    private TableColumn taskNameColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn workDateColumn;
    @javafx.fxml.FXML
    private TableView scheduleTable;
    @javafx.fxml.FXML
    private TableColumn endTimeColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void printButtonOA(ActionEvent actionEvent) {
    }
}