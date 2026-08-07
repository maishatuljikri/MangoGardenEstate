package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Util.SceneSwitcher;
import com.example.mangogardenestate.gardenManagerModelclass.DailyActivityReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DailyActivityReportController {

    @FXML
    private TextField txtReportId;

    @FXML
    private TextField txtReportDate;

    @FXML
    private TextField txtIrrigation;

    @FXML
    private TextField txtFertilizer;

    @FXML
    private TextField txtLabor;

    @FXML
    private TextArea txtReport;

    private DailyActivityReport report;

    @FXML
    private void verifyDataOA() {

        if (txtReportId.getText().isBlank()) {
            showAlert("Please enter Report ID.");
            return;
        }

        report = new DailyActivityReport(
                txtReportId.getText(),
                "05-08-2026",
                "Section A Irrigated",
                "Organic Fertilizer Applied",
                "12 Workers Assigned"
        );

        txtReportDate.setText(report.getReportDate());
        txtIrrigation.setText(report.getIrrigation());
        txtFertilizer.setText(report.getFertilizer());
        txtLabor.setText(report.getLabor());

        showAlert("Data verified successfully.");
    }

    @FXML
    private void generateReportOA() {

        txtReport.setText(
                "========== DAILY ACTIVITY REPORT ==========\n\n" +
                        "Report ID : " + txtReportId.getText() + "\n\n" +
                        "Report Date : " + txtReportDate.getText() + "\n\n" +
                        "Irrigation : " + txtIrrigation.getText() + "\n\n" +
                        "Fertilizer : " + txtFertilizer.getText() + "\n\n" +
                        "Labor : " + txtLabor.getText()
        );

        showAlert("Report generated successfully.");
    }

    @FXML
    private void viewReportOA() {

        if (txtReport.getText().isEmpty()) {
            showAlert("Generate report first.");
            return;
        }

        showAlert("Report displayed in the text area.");
    }

    @FXML
    private void downloadReportOA() {

        if (txtReport.getText().isEmpty()) {
            showAlert("Nothing to download.");
            return;
        }

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Daily Activity Report");
        chooser.setInitialFileName("DailyActivityReport.txt");

        File file = chooser.showSaveDialog(txtReport.getScene().getWindow());

        if (file != null) {

            try (FileWriter writer = new FileWriter(file)) {

                writer.write(txtReport.getText());

                showAlert("Report downloaded successfully.");

            } catch (IOException e) {

                showAlert("Error while saving file.");
            }
        }
    }

    @FXML
    private void clearFormOA() {

        txtReportId.clear();
        txtReportDate.clear();
        txtIrrigation.clear();
        txtFertilizer.clear();
        txtLabor.clear();
        txtReport.clear();

        report = null;
    }

    @FXML
    private void goBackOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/gardenmanagerdashboard.fxml",
                "DailyActivity");

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Daily Activity Report");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();
    }
}