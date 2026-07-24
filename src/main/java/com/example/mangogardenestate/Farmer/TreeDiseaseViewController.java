package com.example.mangogardenestate.Farmer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TreeDiseaseViewController
{
    @javafx.fxml.FXML
    private ComboBox sectionComboBox;
    @javafx.fxml.FXML
    private TextField treeIdField;
    @javafx.fxml.FXML
    private DatePicker reportDatePicker;
    @javafx.fxml.FXML
    private TextArea descriptionArea;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private ComboBox diseaseTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox severityComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
    }
}