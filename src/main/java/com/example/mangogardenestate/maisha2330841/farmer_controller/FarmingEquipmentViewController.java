package com.example.mangogardenestate.maisha2330841.farmer_controller;

import com.example.mangogardenestate.HelloApplication;
import com.example.mangogardenestate.maisha2330841.nonuser.EquipmentRequest;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FarmingEquipmentViewController implements Initializable {

    @FXML
    private ComboBox<String> equipmentComboBox;

    @FXML
    private TextField quantityField;

    @FXML
    private DatePicker requiredDatePicker;

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private TextArea purposeArea;

    @FXML
    private Label messageLabel;

    private final String FILE_NAME = "FarmingEquipment.bin";

    private ArrayList<EquipmentRequest> equipmentList = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        equipmentComboBox.getItems().addAll(
                "Tractor",
                "Sprayer",
                "Water Pump",
                "Wheelbarrow",
                "Ladder",
                "Pruning Shears",
                "Fertilizer Spreader",
                "Harvest Basket"
        );

        priorityComboBox.getItems().addAll(
                "Low",
                "Medium",
                "High",
                "Urgent"
        );

        requiredDatePicker.setValue(LocalDate.now());

        loadData();
    }

    @FXML
    public void submitButtonOA() {

        if (equipmentComboBox.getValue() == null
                || quantityField.getText().isEmpty()
                || requiredDatePicker.getValue() == null
                || priorityComboBox.getValue() == null
                || purposeArea.getText().isEmpty()) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please complete all fields.");
            return;
        }

        try {

            int qty = Integer.parseInt(quantityField.getText());

            if (qty <= 0) {

                messageLabel.setStyle("-fx-text-fill:red;");
                messageLabel.setText("Quantity must be greater than 0.");
                return;
            }

            EquipmentRequest equipment = new EquipmentRequest(

                    equipmentComboBox.getValue(),
                    qty,
                    requiredDatePicker.getValue(),
                    priorityComboBox.getValue(),
                    purposeArea.getText()

            );

            equipmentList.add(equipment);

            saveData();

            messageLabel.setStyle("-fx-text-fill:green;");
            messageLabel.setText("Equipment request saved successfully.");

        }

        catch (NumberFormatException e) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Quantity must be numeric.");

        }

    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME));

            oos.writeObject(equipmentList);

            oos.close();

        }

        catch (IOException e) {

            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(FILE_NAME));

            equipmentList =
                    (ArrayList<EquipmentRequest>) ois.readObject();

            ois.close();

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

    @FXML
    public void clearButtonOA() {

        equipmentComboBox.getSelectionModel().clearSelection();

        quantityField.clear();

        requiredDatePicker.setValue(LocalDate.now());

        priorityComboBox.getSelectionModel().clearSelection();

        purposeArea.clear();

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