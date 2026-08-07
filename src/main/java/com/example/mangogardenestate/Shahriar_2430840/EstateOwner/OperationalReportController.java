package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.EstateOwnerModelclass.OperationalReport;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import javafx.event.ActionEvent;
import com.example.mangogardenestate.Util.SceneSwitcher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OperationalReportController {

    @FXML
    private TextField txtReportId;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtProduction;

    @FXML
    private TextField txtSales;

    @FXML
    private TextField txtStatus;

    @FXML
    private TextArea txtReport;

    private OperationalReport report;

    @FXML
    private void searchReportOA() {

        if (txtReportId.getText().isEmpty()) {
            showAlert("Please enter Report ID.");
            return;
        }

        report = new OperationalReport(
                txtReportId.getText(),
                "Monthly Operational Report",
                "5800 Kg",
                "5300 Kg",
                "Completed"
        );

        txtCategory.setText(report.getCategory());
        txtProduction.setText(report.getProduction());
        txtSales.setText(report.getSales());
        txtStatus.setText(report.getStatus());

        showAlert("Operational Report Found.");
    }

    @FXML
    private void generateReportOA() {

        if (txtProduction.getText().isEmpty()) {
            showAlert("Search report first.");
            return;
        }

        txtReport.setText(
                "========== OPERATIONAL REPORT ==========\n\n" +
                        "Report ID : " + txtReportId.getText() + "\n\n" +
                        "Category : " + txtCategory.getText() + "\n\n" +
                        "Production : " + txtProduction.getText() + "\n\n" +
                        "Sales : " + txtSales.getText() + "\n\n" +
                        "Status : " + txtStatus.getText()
        );

        showAlert("Operational Report Generated.");
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
            showAlert("No report available to download.");
            return;
        }

        FileChooser chooser = new FileChooser();

        chooser.setTitle("Save Operational Report");

        chooser.setInitialFileName("OperationalReport.txt");

        File file = chooser.showSaveDialog(txtReport.getScene().getWindow());

        if (file != null) {

            try (FileWriter writer = new FileWriter(file)) {

                writer.write(txtReport.getText());

                showAlert("Report downloaded successfully.");

            } catch (IOException e) {

                showAlert("Error saving file.");

            }

        }

    }

    @FXML
    private void clearFormOA() {

        txtReportId.clear();
        txtCategory.clear();
        txtProduction.clear();
        txtSales.clear();
        txtStatus.clear();
        txtReport.clear();

        report = null;

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Operational Report");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

    @FXML
        private void goBackOA(ActionEvent actionEvent) {

            SceneSwitcher.switchScene(
                    actionEvent,
                    "/com/example/mangogardenestate/estateownerdashboard.fxml",
                    "Harvest Summary");

        }
}