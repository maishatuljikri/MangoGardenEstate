package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Modelclass4.PestControlActivity;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PestControlActivityViewController {

    @FXML
    private TextField txtRecordId;

    @FXML
    private TextField txtGardenArea;

    @FXML
    private TextField txtPesticide;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtApplicationDate;

    @FXML
    private TextArea txtDetails;

    private PestControlActivity activity;

    @FXML
    private void verifyRecordOA() {

        if (txtRecordId.getText().isBlank()) {
            showAlert("Please enter Record ID.");
            return;
        }

        // Sample Data
        txtGardenArea.setText("Zone A");
        txtPesticide.setText("Bio Pesticide");
        txtQuantity.setText("25");
        txtApplicationDate.setText("05-08-2026");

        showAlert("Record verified successfully.");
    }

    @FXML
    private void saveRecordOA() {

        if (txtRecordId.getText().isBlank()
                || txtGardenArea.getText().isBlank()
                || txtPesticide.getText().isBlank()
                || txtQuantity.getText().isBlank()
                || txtApplicationDate.getText().isBlank()) {

            showAlert("Please complete all fields.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());

            activity = new PestControlActivity(
                    txtRecordId.getText(),
                    txtGardenArea.getText(),
                    txtPesticide.getText(),
                    quantity,
                    txtApplicationDate.getText()
            );

            showAlert("Pest control record saved successfully.");

        } catch (NumberFormatException e) {

            showAlert("Quantity must be numeric.");

        }

    }

    @FXML
    private void viewSummaryOA() {

        if (activity == null) {
            showAlert("Please save the record first.");
            return;
        }

        txtDetails.setText(
                "========== PEST CONTROL REPORT ==========\n\n" +
                        "Record ID : " + activity.getRecordId() + "\n\n" +
                        "Garden Area : " + activity.getGardenArea() + "\n\n" +
                        "Pesticide Name : " + activity.getPesticide() + "\n\n" +
                        "Quantity Used : " + activity.getQuantity() + " Litre\n\n" +
                        "Application Date : " + activity.getApplicationDate()
        );

    }

    @FXML
    private void clearFormOA() {

        txtRecordId.clear();
        txtGardenArea.clear();
        txtPesticide.clear();
        txtQuantity.clear();
        txtApplicationDate.clear();
        txtDetails.clear();

        activity = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("GardenManagerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtRecordId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Pest Control Activity");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }
}