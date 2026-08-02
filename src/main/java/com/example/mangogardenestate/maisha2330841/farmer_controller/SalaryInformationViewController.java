package com.example.mangogardenestate.Farmer;

import com.example.mangogardenestate.maisha2330841.nonuser.SalaryInformation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SalaryInformationViewController implements Initializable {

    @FXML
    private TextField farmerIdField;

    @FXML
    private TextField farmerNameField;

    @FXML
    private TableView<SalaryInformation> salaryTable;

    @FXML
    private TableColumn<SalaryInformation, String> salaryIdColumn;

    @FXML
    private TableColumn<SalaryInformation, String> monthColumn;

    @FXML
    private TableColumn<SalaryInformation, Double> basicSalaryColumn;

    @FXML
    private TableColumn<SalaryInformation, Double> overtimeColumn;

    @FXML
    private TableColumn<SalaryInformation, Double> bonusColumn;

    @FXML
    private TableColumn<SalaryInformation, Double> deductionColumn;

    @FXML
    private TableColumn<SalaryInformation, Double> netSalaryColumn;

    private final ObservableList<SalaryInformation> salaryList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        salaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("salaryId"));
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        basicSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        overtimeColumn.setCellValueFactory(new PropertyValueFactory<>("overtime"));
        bonusColumn.setCellValueFactory(new PropertyValueFactory<>("bonus"));
        deductionColumn.setCellValueFactory(new PropertyValueFactory<>("deduction"));
        netSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("netSalary"));

        farmerIdField.setText("F001");
        farmerNameField.setText("Rahim");

        salaryList.add(new SalaryInformation(
                "SAL001",
                "July",
                30000,
                2000,
                1000,
                500
        ));

        salaryList.add(new SalaryInformation(
                "SAL002",
                "August",
                30000,
                1500,
                500,
                300
        ));

        salaryTable.setItems(salaryList);
    }

    @FXML
    private void generateReportButtonOA() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Generate Report");
        alert.setHeaderText(null);
        alert.setContentText("Salary report generated successfully.");
        alert.showAndWait();
    }

    @FXML
    private void downloadReportButtonOA() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Download Report");
        alert.setHeaderText(null);
        alert.setContentText("Salary report downloaded successfully.");
        alert.showAndWait();
    }

    @FXML
    private void backButtonOA() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Back");
        alert.setHeaderText(null);
        alert.setContentText("Back button clicked.");
        alert.showAndWait();
    }
}