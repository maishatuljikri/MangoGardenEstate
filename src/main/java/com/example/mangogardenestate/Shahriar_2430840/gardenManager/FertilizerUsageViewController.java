package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Modelclass4.FertilizerUsage;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FertilizerUsageViewController {

    @FXML
    private TextField txtFertilizerId;

    @FXML
    private TextField txtFertilizerName;

    @FXML
    private TextField txtSection;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtUsageDate;

    @FXML
    private TextArea txtDetails;

    private FertilizerUsage usage;

    @FXML
    private void verifyStockOA() {

        if (txtFertilizerId.getText().isBlank()) {
            showAlert("Please enter Fertilizer ID.");
            return;
        }

        usage = new FertilizerUsage(
                txtFertilizerId.getText(),
                "Organic Compost",
                "Section A",
                50,
                "05-08-2026"
        );

        txtFertilizerName.setText(usage.getFertilizerName());
        txtSection.setText(usage.getSection());
        txtQuantity.setText(String.valueOf(usage.getQuantity()));
        txtUsageDate.setText(usage.getUsageDate());

        showAlert("Stock verified successfully.");
    }

    @FXML
    private void updateStockOA() {

        if (txtQuantity.getText().isBlank()) {
            showAlert("Enter quantity.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());

            txtDetails.setText(
                    "Stock Updated Successfully\n\n" +
                            "Fertilizer : " + txtFertilizerName.getText() + "\n" +
                            "Section : " + txtSection.getText() + "\n" +
                            "Used Quantity : " + quantity + " Kg\n" +
                            "Date : " + txtUsageDate.getText()
            );

            showAlert("Stock updated.");

        } catch (NumberFormatException e) {

            showAlert("Quantity must be numeric.");

        }

    }

    @FXML
    private void viewSummaryOA() {

        if (usage == null) {
            showAlert("Verify stock first.");
            return;
        }

        txtDetails.setText(
                "========== FERTILIZER USAGE REPORT ==========\n\n" +
                        "Fertilizer ID : " + usage.getFertilizerId() + "\n\n" +
                        "Fertilizer Name : " + usage.getFertilizerName() + "\n\n" +
                        "Garden Section : " + usage.getSection() + "\n\n" +
                        "Quantity Used : " + usage.getQuantity() + " Kg\n\n" +
                        "Usage Date : " + usage.getUsageDate()
        );

    }

    @FXML
    private void clearFormOA() {

        txtFertilizerId.clear();
        txtFertilizerName.clear();
        txtSection.clear();
        txtQuantity.clear();
        txtUsageDate.clear();
        txtDetails.clear();

        usage = null;
    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("GardenManagerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtFertilizerId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Fertilizer Usage");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();
    }
}