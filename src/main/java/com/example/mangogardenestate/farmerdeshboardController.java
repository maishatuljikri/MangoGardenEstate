package com.example.mangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class farmerdeshboardController {

    private void changeScene(ActionEvent event, String fileName) {

        try {

            Parent root = FXMLLoader.load(getClass().getResource(fileName));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Scene Loading Error");
            alert.setContentText(fileName + " not found.");
            alert.showAndWait();
        }
    }

    @FXML
    public void DailyWorkButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/DailyWorkStatusView.fxml");
    }

    @FXML
    public void EquipmentRequestButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/FarmingEquipmentView.fxml");
    }

    @FXML
    public void MangoQuantityButtonOA(ActionEvent event){
        changeScene(event, "/com/example/mangogardenestate/maisha2330841/farmer_controller/recordharvestmangoquantity.fxml");
    }


    @FXML
    public void TreeDiseaseReportButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/TreeDiseasesView.fxml");
    }

    @FXML
    public void RecordHarvestButtonOA(ActionEvent event){
        changeScene(event, "/com/example/mangogardenestate/maisha2330841/farmer_controller/recordharvestmangoquantity.fxml");
    }

    @FXML
    public void WorkScheduleButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/WorkScheduleView.fxml");
    }

    @FXML
    public void IrrigationStatusButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/IrrigationCompletionStatusView.fxml");
    }

    @FXML
    public void SalaryInformationButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/SalaryInformationView.fxml");
    }

    @FXML
    public void LeaveButtonOARequest(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/RequestLeaveView.fxml");
    }

    @FXML
    public void NextButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/maisha2330841/farmer_controller/DailyWorkStatusView.fxml");
    }

    @FXML
    public void BackButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/farmerdeshboard.fxml");
    }

    @FXML
    public void LogoutButtonOA(ActionEvent event){
        changeScene(event,"/com/example/mangogardenestate/LoginView.fxml");
    }

}