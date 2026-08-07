package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Util.SceneSwitcher;
import com.example.mangogardenestate.gardenManagerModelclass.DailyActivityReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.ArrayList;

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

    private final String FILE_NAME = "DailyActivityReport.bin";

    private ArrayList<DailyActivityReport> reportList = new ArrayList<>();

    @FXML
    public void initialize() {
        loadData();
    }

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

        if (txtReportId.getText().isBlank()) {
            showAlert("Please enter Report ID.");
            return;
        }

        report = new DailyActivityReport(

                txtReportId.getText(),
                txtReportDate.getText(),
                txtIrrigation.getText(),
                txtFertilizer.getText(),
                txtLabor.getText()

        );

        reportList.add(report);

        saveData();

        txtReport.setText(

                "========== DAILY ACTIVITY REPORT ==========\n\n" +

                        "Report ID : " + report.getReportId() + "\n\n" +

                        "Report Date : " + report.getReportDate() + "\n\n" +

                        "Irrigation : " + report.getIrrigation() + "\n\n" +

                        "Fertilizer : " + report.getFertilizer() + "\n\n" +

                        "Labor : " + report.getLabor()

        );

        showAlert("Report generated and saved successfully.");

    }

    @FXML
    private void viewReportOA() {

        if (txtReportId.getText().isBlank()) {

            showAlert("Enter Report ID.");

            return;

        }

        for (DailyActivityReport r : reportList) {

            if (r.getReportId().equals(txtReportId.getText())) {

                report = r;

                txtReportDate.setText(r.getReportDate());
                txtIrrigation.setText(r.getIrrigation());
                txtFertilizer.setText(r.getFertilizer());
                txtLabor.setText(r.getLabor());

                txtReport.setText(

                        "========== DAILY ACTIVITY REPORT ==========\n\n" +

                                "Report ID : " + r.getReportId() + "\n\n" +

                                "Report Date : " + r.getReportDate() + "\n\n" +

                                "Irrigation : " + r.getIrrigation() + "\n\n" +

                                "Fertilizer : " + r.getFertilizer() + "\n\n" +

                                "Labor : " + r.getLabor()

                );

                showAlert("Report Found.");

                return;

            }

        }

        showAlert("Report Not Found.");

    }

    @FXML
    private void downloadReportOA() {

        if (txtReport.getText().isBlank()) {

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

            }

            catch (IOException e) {

                showAlert("Unable to save file.");

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
                "Garden Manager Dashboard"
        );

    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME));

            oos.writeObject(reportList);

            oos.close();

        }

        catch (IOException e) {

            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {

            return;

        }

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(FILE_NAME));

            reportList =
                    (ArrayList<DailyActivityReport>) ois.readObject();

            ois.close();

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Daily Activity Report");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}