package com.example.mangogardenestate.Shahriar_2430840.gardenManager;

import com.example.mangogardenestate.Modelclass4.TreeCondition;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RecordTreeConditionViewController {

    @FXML
    private TextField txtTreeId;

    @FXML
    private TextField txtSection;

    @FXML
    private TextField txtCondition;

    @FXML
    private TextField txtInspectionDate;

    @FXML
    private TextField txtInspector;

    @FXML
    private TextArea txtDetails;

    private TreeCondition treeCondition;

    @FXML
    private void verifySectionOA() {

        if (txtSection.getText().isBlank()) {

            showAlert("Please enter Garden Section.");
            return;

        }

        txtInspector.setText("Md. Karim");

        showAlert("Garden Section Verified.");

    }

    @FXML
    private void saveConditionOA() {

        if (txtTreeId.getText().isBlank()
                || txtSection.getText().isBlank()
                || txtCondition.getText().isBlank()
                || txtInspectionDate.getText().isBlank()
                || txtInspector.getText().isBlank()) {

            showAlert("Please complete all fields.");
            return;

        }

        treeCondition = new TreeCondition(

                txtTreeId.getText(),
                txtSection.getText(),
                txtCondition.getText(),
                txtInspectionDate.getText(),
                txtInspector.getText()

        );

        showAlert("Tree condition saved successfully.");

    }

    @FXML
    private void viewConfirmationOA() {

        if (treeCondition == null) {

            showAlert("Please save the condition first.");
            return;

        }

        txtDetails.setText(

                "========== TREE CONDITION REPORT ==========\n\n"

                        + "Tree ID : "
                        + treeCondition.getTreeId()

                        + "\n\nGarden Section : "
                        + treeCondition.getSection()

                        + "\n\nTree Condition : "
                        + treeCondition.getCondition()

                        + "\n\nInspection Date : "
                        + treeCondition.getInspectionDate()

                        + "\n\nInspector : "
                        + treeCondition.getInspector()

        );

    }

    @FXML
    private void clearFormOA() {

        txtTreeId.clear();
        txtSection.clear();
        txtCondition.clear();
        txtInspectionDate.clear();
        txtInspector.clear();
        txtDetails.clear();

        treeCondition = null;

    }

    @FXML
    private void goBackOA() {

        showAlert("Back button clicked.");

        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("GardenManagerDashboard.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) txtTreeId.getScene().getWindow();

        stage.setScene(new Scene(root));
        */

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Tree Condition");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}