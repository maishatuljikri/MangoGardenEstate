package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Modelclass4.IrrigationActivity;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class IrrigationActivityViewController {

    @FXML
    private TextField txtIrrigationId;

    @FXML
    private TextField txtZone;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtWaterQuantity;

    @FXML
    private TextField txtSupervisor;

    @FXML
    private TextArea txtDetails;

    private IrrigationActivity activity;

    @FXML
    private void verifyZoneOA() {

        if (txtZone.getText().isBlank()) {
            showAlert("Please enter irrigation zone.");
            return;
        }

        txtSupervisor.setText("Md. Karim");

        showAlert("Zone verified successfully.");
    }

    @FXML
    private void saveRecordOA() {

        if (txtIrrigationId.getText().isBlank()
                || txtZone.getText().isBlank()
                || txtDate.getText().isBlank()
                || txtWaterQuantity.getText().isBlank()
                || txtSupervisor.getText().isBlank()) {

            showAlert("Please fill in all fields.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtWaterQuantity.getText());

            activity = new IrrigationActivity(
                    txtIrrigationId.getText(),
                    txtZone.getText(),
                    txtDate.getText(),
                    quantity,
                    txtSupervisor.getText()
            );

            showAlert("Irrigation record saved successfully.");

        } catch (NumberFormatException e) {

            showAlert("Water quantity must be numeric.");

        }

    }

    @FXML
    private void viewSummaryOA() {

        if (activity == null) {

            showAlert("Please save the record first.");
            return;

        }

        txtDetails.setText(
                "========== IRRIGATION ACTIVITY ==========\n\n" +
                        "Irrigation ID : " + activity.getIrrigationId() + "\n\n" +
                        "Zone : " + activity.getZone() + "\n\n" +
                        "Date : " + activity.getDate() + "\n\n" +
                        "Water Quantity : " + activity.getWaterQuantity() + " Liters\n\n" +
                        "Supervisor : " + activity.getSupervisor()
        );

    }

    @FXML
    private void clearFormOA() {

        txtIrrigationId.clear();
        txtZone.clear();
        txtDate.clear();
        txtWaterQuantity.clear();
        txtSupervisor.clear();
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
                (Stage) txtIrrigationId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Irrigation Activity");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }
}