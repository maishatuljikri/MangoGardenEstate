package com.example.mangogardenestate.Shahriar_2430840.gardenManager;


import com.example.mangogardenestate.Util.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class gardenmanagerdashboardController {
    @javafx.fxml.FXML
    public void PastControlButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/PestControlActivityView.fxml",
            "PastControl");
    }

    @javafx.fxml.FXML
    public void LogoutButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IrrigationActivitiesButtonOA(ActionEvent actionEvent)
    {  SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/IrrigationActivityView.fxml",
            "Irragation");
    }

    @javafx.fxml.FXML
    public void RecordTreeConditionsButtonOA(ActionEvent actionEvent)
    {  SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/RecordTreeConditionView.fxml",
            "RecordTree");
    }

    @javafx.fxml.FXML
    public void AssignDailyTasksButtonOA(ActionEvent actionEvent)
    { SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/AssignDailyTaskView.fxml",
            "DailyTask");
    }

    @javafx.fxml.FXML
    public void DailyActivityReportButtonOA(ActionEvent actionEvent)
    { SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/DailyActivityReportView.fxml",
            "ActivityReport");
    }

    @javafx.fxml.FXML
    public void FertilizerUsageButtonOA(ActionEvent actionEvent)
    {  SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/FertilizerUsageView.fxml",
            "ActivityReport");
    }

    @javafx.fxml.FXML
    public void WorkerAttendanceButtonOA(ActionEvent actionEvent)
    {SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/WorkerAttendanceView.fxml",
            "Attendance");
    }

    @javafx.fxml.FXML
    public void HarvestingScheduleButtonOA(ActionEvent actionEvent)
    {SceneSwitcher.switchScene(
            actionEvent,
            "/com/example/mangogardenestate/Shahriar_2430840/garden Manager/HarvestingScheduleView.fxml",
            "Harvesting");
    }
}
