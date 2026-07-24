package com.example.mangogardenestate.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProductReviewViewController
{
    @javafx.fxml.FXML
    private TextField customerIdField;
    @javafx.fxml.FXML
    private ComboBox orderIdComboBox;
    @javafx.fxml.FXML
    private ComboBox mangoComboBox;
    @javafx.fxml.FXML
    private ComboBox ratingComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private DatePicker reviewDatePicker;
    @javafx.fxml.FXML
    private TextArea reviewTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
    }
}