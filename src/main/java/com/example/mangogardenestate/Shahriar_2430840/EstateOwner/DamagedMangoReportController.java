package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.Modelclass3.DamagedMangoReport;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DamagedMangoReportController {

    @FXML
    private TextField txtReportId;

    @FXML
    private TextField txtReportDate;

    @FXML
    private TextField txtVariety;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtReason;

    @FXML
    private TextArea txtSummary;

    private DamagedMangoReport report;

    @FXML
    private void searchReportOA() {

        if (txtReportId.getText().isEmpty()) {

            showAlert("Please enter Report ID.");
            return;

        }

        report = new DamagedMangoReport(
                txtReportId.getText(),
                "31-07-2026",
                "Himsagar",
                45,
                "Pest Attack"
        );

        txtReportDate.setText(report.getReportDate());
        txtVariety.setText(report.getVariety());
        txtQuantity.setText(String.valueOf(report.getQuantity()));
        txtReason.setText(report.getReason());

        showAlert("Damaged Mango Record Found.");

    }

    @FXML
    private void calculateDamageOA() {

        if (txtQuantity.getText().isEmpty()) {

            showAlert("Quantity field is empty.");
            return;

        }

        int quantity = Integer.parseInt(txtQuantity.getText());

        txtSummary.setText(
                "Total Damaged Mango Quantity = "
                        + quantity
                        + " Kg"
        );

        showAlert("Calculation Completed.");

    }

    @FXML
    private void viewReportOA() {

        if (report == null) {

            showAlert("Please search a report first.");
            return;

        }

        txtSummary.setText(

                "========== DAMAGED MANGO REPORT ==========\n\n"

                        + "Report ID : "
                        + report.getReportId()

                        + "\nReport Date : "
                        + report.getReportDate()

                        + "\nMango Variety : "
                        + report.getVariety()

                        + "\nDamaged Quantity : "
                        + report.getQuantity()
                        + " Kg"

                        + "\nDamage Reason : "
                        + report.getReason()

        );

    }

    @FXML
    private void clearFormOA() {

        txtReportId.clear();
        txtReportDate.clear();
        txtVariety.clear();
        txtQuantity.clear();
        txtReason.clear();
        txtSummary.clear();

        report = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("OwnerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtReportId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Damaged Mango Report");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}