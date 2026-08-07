package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.Util.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class estateownerdashboardController {

    @FXML
    public void ProductionReportButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/mangoProductionRecordsView.fxml",
                "Production Record");
    }

    @FXML
    public void DailySaleButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/TrackDailySalesView.fxml",
                "Daily Sales");
    }

    @FXML
    public void WorkerAttendanceButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/AttendanceReportView.fxml",
                "Worker Attendance");
    }

    @FXML
    public void WarehouseStockButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/WarehouseStockView.fxml",
                "Warehouse Stock");
    }

    @FXML
    public void MonthlyExpenseButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/MonthlyExpenseReportView.fxml",
                "Monthly Expense");
    }

    @FXML
    public void DamagedMongoButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/DamagedMangoReportView.fxml",
                "Damaged Mango Report");
    }

    @FXML
    public void HarvestSummaryButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/DailyHarvestSummaryView.fxml",
                "Harvest Summary");
    }

    @FXML
    public void OperationalReportButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Shahriar_2430840/Estate Owner/GenerateOperationalReportView.fxml",
                "Operational Report");
    }

    @FXML
    public void LogoutButtonOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/Login.fxml",
                "Login");
    }
}