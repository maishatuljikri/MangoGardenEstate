package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Modelclass4.HarvestingSchedule;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HarvestingScheduleViewController {

    @FXML
    private TextField txtScheduleId;

    @FXML
    private TextField txtHarvestDate;

    @FXML
    private TextField txtGardenZone;

    @FXML
    private TextField txtWorkerName;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextArea txtDetails;

    private HarvestingSchedule schedule;

    @FXML
    private void verifyWorkerOA() {

        if (txtWorkerName.getText().isBlank()) {
            showAlert("Please enter Worker Name.");
            return;
        }

        showAlert("Worker verified successfully.");
    }

    @FXML
    private void saveScheduleOA() {

        if (txtScheduleId.getText().isBlank()
                || txtHarvestDate.getText().isBlank()
                || txtGardenZone.getText().isBlank()
                || txtWorkerName.getText().isBlank()
                || txtQuantity.getText().isBlank()) {

            showAlert("Please fill in all fields.");
            return;
        }

        try {

            double quantity = Double.parseDouble(txtQuantity.getText());

            schedule = new HarvestingSchedule(
                    txtScheduleId.getText(),
                    txtHarvestDate.getText(),
                    txtGardenZone.getText(),
                    txtWorkerName.getText(),
                    quantity
            );

            showAlert("Harvesting schedule saved successfully.");

        } catch (NumberFormatException e) {

            showAlert("Quantity must be a valid number.");

        }

    }

    @FXML
    private void viewConfirmationOA() {

        if (schedule == null) {
            showAlert("Please save the schedule first.");
            return;
        }

        txtDetails.setText(
                "========== HARVESTING SCHEDULE ==========\n\n" +
                        "Schedule ID : " + schedule.getScheduleId() + "\n\n" +
                        "Harvest Date : " + schedule.getHarvestDate() + "\n\n" +
                        "Garden Zone : " + schedule.getGardenZone() + "\n\n" +
                        "Worker Name : " + schedule.getWorkerName() + "\n\n" +
                        "Expected Quantity : " + schedule.getQuantity() + " Kg"
        );

    }

    @FXML
    private void clearFormOA() {

        txtScheduleId.clear();
        txtHarvestDate.clear();
        txtGardenZone.clear();
        txtWorkerName.clear();
        txtQuantity.clear();
        txtDetails.clear();

        schedule = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("GardenManagerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtScheduleId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Harvesting Schedule");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}