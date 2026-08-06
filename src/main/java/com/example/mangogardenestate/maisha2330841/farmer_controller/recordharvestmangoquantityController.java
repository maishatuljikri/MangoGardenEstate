package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.HelloApplication;
import com.example.mangogardenestate.maisha2330841.nonuser.recordharvestmangoquantity;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class recordharvestmangoquantityController implements Initializable {

    @FXML
    private DatePicker harvestDatePicker;

    @FXML
    private ComboBox<String> sectionComboBox;

    @FXML
    private TextField varietyField;

    @FXML
    private TextField quantityField;

    @FXML
    private ComboBox<String> gradeComboBox;

    @FXML
    private TextArea remarksArea;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sectionComboBox.setItems(FXCollections.observableArrayList(
                "Section A",
                "Section B",
                "Section C",
                "Section D"
        ));

        gradeComboBox.setItems(FXCollections.observableArrayList(
                "A",
                "B",
                "C"
        ));
    }

    @FXML
    private void saveButtonOA(ActionEvent event) {

        try {

            if (harvestDatePicker.getValue() == null ||
                    sectionComboBox.getValue() == null ||
                    varietyField.getText().isEmpty() ||
                    quantityField.getText().isEmpty() ||
                    gradeComboBox.getValue() == null) {

                messageLabel.setText("Fill all required fields.");
                return;
            }

            double qty = Double.parseDouble(quantityField.getText());

            recordharvestmangoquantity record =
                    new recordharvestmangoquantity(
                            harvestDatePicker.getValue(),
                            sectionComboBox.getValue(),
                            varietyField.getText(),
                            qty,
                            gradeComboBox.getValue(),
                            remarksArea.getText()
                    );

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream("HarvestRecord.bin", true)
                    );

            output.writeObject(record);
            output.close();

            messageLabel.setText("Record Saved Successfully.");

        }
        catch (NumberFormatException e) {
            messageLabel.setText("Quantity must be numeric.");
        }
        catch (IOException e) {
            messageLabel.setText("Error saving file.");
            e.printStackTrace();
        }
    }

    @FXML
    private void clearButtonOA(ActionEvent event) {

        harvestDatePicker.setValue(null);
        sectionComboBox.setValue(null);
        varietyField.clear();
        quantityField.clear();
        gradeComboBox.setValue(null);
        remarksArea.clear();
        messageLabel.setText("");
    }

    @FXML
    public void backButtonOA(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/example/mangogardenestate/farmerdeshboard.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

}