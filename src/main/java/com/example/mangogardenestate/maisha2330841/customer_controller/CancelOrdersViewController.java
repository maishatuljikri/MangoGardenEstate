package com.example.mangogardenestate.maisha2330841.customer_controller;

import com.example.mangogardenestate.maisha2330841.nonuser.CancelOrder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CancelOrdersViewController {

    @FXML
    private TextField orderIdField;

    @FXML
    private Label statusLabel;

    @FXML
    private DatePicker cancelDatePicker;

    @FXML
    private ComboBox<String> reasonComboBox;

    @FXML
    private TextArea commentsArea;

    @FXML
    private Label messageLabel;

    private final String FILE_NAME = "CancelOrders.bin";

    private ArrayList<CancelOrder> cancelOrderList = new ArrayList<>();

    @FXML
    public void initialize() {

        reasonComboBox.getItems().addAll(
                "Changed My Mind",
                "Ordered by Mistake",
                "Found Better Price",
                "Delivery Delay",
                "Other"
        );

        cancelDatePicker.setValue(LocalDate.now());
        statusLabel.setText("Pending");

        loadData();
    }

    @FXML
    public void submitButtonOA(ActionEvent event) {

        if (orderIdField.getText().isEmpty()
                || cancelDatePicker.getValue() == null
                || reasonComboBox.getValue() == null) {

            messageLabel.setStyle("-fx-text-fill:red;");
            messageLabel.setText("Please fill all required fields.");
            return;
        }

        CancelOrder order = new CancelOrder(
                orderIdField.getText(),
                "Cancelled",
                cancelDatePicker.getValue(),
                reasonComboBox.getValue(),
                commentsArea.getText()
        );

        cancelOrderList.add(order);

        saveData();

        statusLabel.setText("Cancelled");

        messageLabel.setStyle("-fx-text-fill:green;");
        messageLabel.setText("Order cancelled successfully.");

        System.out.println("Order ID : " + order.getOrderId());
        System.out.println("Status : " + order.getStatus());
        System.out.println("Date : " + order.getCancelDate());
        System.out.println("Reason : " + order.getReason());
        System.out.println("Comments : " + order.getComments());
    }

    private void saveData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(cancelOrderList);

            oos.close();

        } catch (IOException e) {

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
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            cancelOrderList =
                    (ArrayList<CancelOrder>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @FXML
    public void ClearButtonOA(ActionEvent event) {

        orderIdField.clear();
        cancelDatePicker.setValue(LocalDate.now());
        reasonComboBox.getSelectionModel().clearSelection();
        commentsArea.clear();

        statusLabel.setText("Pending");
        messageLabel.setText("");
    }

    @FXML
    public void backButtonOA(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/mangogardenestate/customerdeshboard.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Scene Error");
            alert.setHeaderText(null);
            alert.setContentText("Cannot open Customer Dashboard.");
            alert.showAndWait();
        }
    }
}