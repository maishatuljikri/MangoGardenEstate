package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class farmerdeshboardController {

    private void loadScene(ActionEvent event, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DailyWorkButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/DailyWorkStatusView.fxml");
    }

    public void EquipmentRequestButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/FarmingEquipmentView.fxml");
    }

    public void TreeDiseaseReportButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/TreeDiseaseView.fxml");
    }

    public void RecordHarvestButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/MangoQuantityView.fxml");
    }

    public void WorkScheduleButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/WorkScheduleView.fxml");
    }

    public void IrrigationStatusButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/IrrigationCompletionStatusView.fxml");
    }

    public void SalaryInformationButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/SalaryInformationView.fxml");
    }

    public void LeaveButtonOARequest(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/LeaveRequestView.fxml");
    }

    public void NextButtonOA(ActionEvent event) {
        System.out.println("Next button clicked.");
    }

    public void BackButtonOA(ActionEvent event) {
        System.out.println("Back button clicked.");
    }

    public void LogoutButtonOA(ActionEvent event) {
        loadScene(event, "/com/example/mangogardenestate/LoginView.fxml");
    }
}