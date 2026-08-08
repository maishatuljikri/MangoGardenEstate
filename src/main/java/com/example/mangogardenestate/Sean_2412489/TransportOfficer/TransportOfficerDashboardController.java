package com.example.mangogardenestate.Sean_2412489.TransportOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL; // Needed for the safer resource loading

public class TransportOfficerDashboardController {

    @FXML
    private AnchorPane mainContentPane;

    private void loadView(String fxmlFileName) {
        try {
            // Absolute path ensuring JavaFX always finds the FXML file
            // Make sure the path matches your resources folder structure exactly
            URL resource = getClass().getResource("/com/example/mangogardenestate/Sean_2412489/TransportOfficer/" + fxmlFileName);

            if (resource == null) {
                System.err.println("Error: FXML file not found at /com/example/mangogardenestate/Sean_2412489/TransportOfficer/" + fxmlFileName);
                return;
            }

            FXMLLoader loader = new FXMLLoader(resource);
            Node node = loader.load();
            mainContentPane.getChildren().setAll(node);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openAssignVehiclesOA(ActionEvent event) {
        loadView("Assign Vehicles for Transportation.fxml");
    }

    @FXML
    public void openGenerateReportsOA(ActionEvent event) {
        loadView("Generate Transportation Reports.fxml");
    }

    @FXML
    public void openManageDriverAssignmentsOA(ActionEvent event) {
        loadView("Manage Driver Assignments.fxml");
    }

    @FXML
    public void openManageDispatchOperationsOA(ActionEvent event) {
        loadView("Manage Warehouse Dispatch Operations.fxml");
    }

    @FXML
    public void openMonitorFuelConsumptionOA(ActionEvent event) {
        loadView("Monitor Fuel Consumption Records.fxml");
    }

    @FXML
    public void openRecordVehicleMaintenanceOA(ActionEvent event) {
        loadView("Record Vehicle Maintenance Activities.fxml");
    }

    @FXML
    public void openScheduleDeliveriesOA(ActionEvent event) {
        loadView("Schedule Mango Deliveries.fxml");
    }

    @FXML
    public void openTrackDeliveryStatusOA(ActionEvent event) {
        loadView("Track Delivery Status.fxml");
    }

    @FXML
    public void logoutButtonOA(ActionEvent event) {
        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/com/example/mangogardenestate/LoginView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loginRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}