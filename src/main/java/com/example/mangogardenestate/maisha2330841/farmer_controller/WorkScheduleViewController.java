package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.maisha2330841.nonuser.WorkSchedule;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WorkScheduleViewController implements Initializable {

    @FXML
    private TableView<WorkSchedule> scheduleTableTC;

    @FXML
    private TableColumn<WorkSchedule, String> taskIdColumn;

    @FXML
    private TableColumn<WorkSchedule, String> taskNameColumn;

    @FXML
    private TableColumn<WorkSchedule, String> workDateColumn;

    @FXML
    private TableColumn<WorkSchedule, String> startTimeColumn;

    @FXML
    private TableColumn<WorkSchedule, String> endTimeColumn;

    @FXML
    private TableColumn<WorkSchedule, String> sectionColumn;

    @FXML
    private TableColumn<WorkSchedule, String> statusColumn;

    private final ObservableList<WorkSchedule> scheduleList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        taskIdColumn.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        taskNameColumn.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        workDateColumn.setCellValueFactory(new PropertyValueFactory<>("workDate"));
        startTimeColumn.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTimeColumn.setCellValueFactory(new PropertyValueFactory<>("endTime"));
        sectionColumn.setCellValueFactory(new PropertyValueFactory<>("section"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        scheduleList.add(new WorkSchedule(
                "T001",
                "Water Mango Trees",
                "25-07-2026",
                "08:00 AM",
                "10:00 AM",
                "Section A",
                "Pending"
        ));

        scheduleList.add(new WorkSchedule(
                "T002",
                "Apply Fertilizer",
                "25-07-2026",
                "10:30 AM",
                "12:00 PM",
                "Section B",
                "Completed"
        ));

        scheduleList.add(new WorkSchedule(
                "T003",
                "Harvest Mangoes",
                "26-07-2026",
                "08:00 AM",
                "11:00 AM",
                "Section C",
                "Pending"
        ));

        scheduleTableTC.setItems(scheduleList);
    }

    @FXML
    private void printButtonOA() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Print");
        alert.setHeaderText(null);
        alert.setContentText("Work schedule printed successfully.");
        alert.showAndWait();
    }

    @FXML
    private void backButtonOA(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/com/example/mangogardenestate/maisha2330841/farmer_controller/FarmerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}