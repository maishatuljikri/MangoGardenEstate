package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.Modelclass3.HarvestSummary;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DailyHarvestSummaryController {

    @FXML
    private TextField txtHarvestId;

    @FXML
    private TextField txtHarvestDate;

    @FXML
    private TextField txtSection;

    @FXML
    private TextField txtVariety;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextArea txtSummary;

    private HarvestSummary harvestSummary;

    @FXML
    private void searchHarvestOA() {

        if (txtHarvestId.getText().isEmpty()) {

            showAlert("Please enter Harvest ID.");
            return;

        }

        harvestSummary = new HarvestSummary(
                txtHarvestId.getText(),
                "31-07-2026",
                "Section-A",
                "Langra",
                560
        );

        txtHarvestDate.setText(harvestSummary.getHarvestDate());
        txtSection.setText(harvestSummary.getSection());
        txtVariety.setText(harvestSummary.getVariety());
        txtQuantity.setText(String.valueOf(harvestSummary.getQuantity()));

        showAlert("Harvest Record Found.");

    }

    @FXML
    private void calculateHarvestOA() {

        if (txtQuantity.getText().isEmpty()) {

            showAlert("No harvest quantity available.");
            return;

        }

        int quantity = Integer.parseInt(txtQuantity.getText());

        txtSummary.setText(
                "Today's Total Harvest = "
                        + quantity
                        + " Kg"
        );

        showAlert("Calculation Completed.");

    }

    @FXML
    private void viewSummaryOA() {

        if (harvestSummary == null) {

            showAlert("Search harvest record first.");
            return;

        }

        txtSummary.setText(

                "========== DAILY HARVEST REPORT ==========\n\n"

                        + "Harvest ID : "
                        + harvestSummary.getHarvestId()

                        + "\nHarvest Date : "
                        + harvestSummary.getHarvestDate()

                        + "\nGarden Section : "
                        + harvestSummary.getSection()

                        + "\nMango Variety : "
                        + harvestSummary.getVariety()

                        + "\nHarvest Quantity : "
                        + harvestSummary.getQuantity()
                        + " Kg"

        );

    }

    @FXML
    private void clearFormOA() {

        txtHarvestId.clear();
        txtHarvestDate.clear();
        txtSection.clear();
        txtVariety.clear();
        txtQuantity.clear();
        txtSummary.clear();

        harvestSummary = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("OwnerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtHarvestId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Daily Harvest Summary");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}