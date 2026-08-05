package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.Modelclass3.ProductionRecord;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProductionRecordController {

    @FXML
    private TextField txtProductionId;

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

    private ProductionRecord record;

    @FXML
    private void searchRecordOA() {

        if (txtProductionId.getText().trim().isEmpty()) {
            showAlert("Please enter Production ID.");
            return;
        }

        // Sample Data
        record = new ProductionRecord(
                txtProductionId.getText(),
                "31-07-2026",
                "Section-A",
                "Himsagar",
                750
        );

        txtHarvestDate.setText(record.getHarvestDate());
        txtSection.setText(record.getSection());
        txtVariety.setText(record.getVariety());
        txtQuantity.setText(String.valueOf(record.getQuantity()));

        showAlert("Production record found.");

    }

    @FXML
    private void calculateProductionOA() {

        if (txtQuantity.getText().trim().isEmpty()) {
            showAlert("Please enter production quantity.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());

            txtSummary.setText(
                    "Today's Total Production : "
                            + quantity
                            + " Kg"
            );

            showAlert("Production calculated successfully.");

        } catch (NumberFormatException e) {

            showAlert("Quantity must be numeric.");

        }

    }

    @FXML
    private void viewRecordOA() {

        if (record == null) {

            showAlert("Please search a production record first.");
            return;

        }

        txtSummary.setText(
                "========== PRODUCTION RECORD ==========\n\n" +
                        "Production ID : " + record.getProductionId() + "\n\n" +
                        "Harvest Date : " + record.getHarvestDate() + "\n\n" +
                        "Garden Section : " + record.getSection() + "\n\n" +
                        "Mango Variety : " + record.getVariety() + "\n\n" +
                        "Production : " + record.getQuantity() + " Kg"
        );

    }

    @FXML
    private void clearFormOA() {

        txtProductionId.clear();
        txtHarvestDate.clear();
        txtSection.clear();
        txtVariety.clear();
        txtQuantity.clear();
        txtSummary.clear();

        record = null;

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Production Record");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}