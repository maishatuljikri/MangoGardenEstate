package com.example.mangogardenestate.Shahriar_2430840.EstateOwner;

import com.example.mangogardenestate.EstateOwnerModelclass.MonthlyExpense;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import javafx.event.ActionEvent;
import com.example.mangogardenestate.Util.SceneSwitcher;


public class MonthlyExpenseController {

    @FXML
    private TextField txtMonth;

    @FXML
    private TextField txtYear;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtTotalExpense;

    @FXML
    private TextArea txtSummary;

    private MonthlyExpense expense;

    @FXML
    private void searchExpenseOA() {

        if (txtMonth.getText().trim().isEmpty()) {
            showAlert("Please enter Month.");
            return;
        }

        // Sample Data
        expense = new MonthlyExpense(
                txtMonth.getText(),
                "2026",
                "Fertilizer",
                12000,
                12000
        );

        txtYear.setText(expense.getYear());
        txtCategory.setText(expense.getCategory());
        txtAmount.setText(String.valueOf(expense.getAmount()));
        txtTotalExpense.setText(String.valueOf(expense.getTotalExpense()));

        showAlert("Expense record found.");

    }

    @FXML
    private void calculateExpenseOA() {

        if (txtAmount.getText().trim().isEmpty()) {
            showAlert("Please enter Expense Amount.");
            return;
        }

        try {

            double amount = Double.parseDouble(txtAmount.getText());

            txtTotalExpense.setText(String.valueOf(amount));

            txtSummary.setText(
                    "Monthly Expense for "
                            + txtMonth.getText()
                            + " "
                            + txtYear.getText()
                            + "\n\nCategory : "
                            + txtCategory.getText()
                            + "\nExpense : "
                            + amount
                            + " Tk"
            );

            showAlert("Expense calculated successfully.");

        } catch (NumberFormatException e) {

            showAlert("Expense amount must be numeric.");

        }

    }

    @FXML
    private void viewSummaryOA() {

        if (txtTotalExpense.getText().isEmpty()) {
            showAlert("Please calculate the expense first.");
            return;
        }

        txtSummary.setText(

                "========== MONTHLY EXPENSE REPORT ==========\n\n"

                        + "Month : " + txtMonth.getText()

                        + "\nYear : " + txtYear.getText()

                        + "\nCategory : " + txtCategory.getText()

                        + "\nExpense Amount : " + txtAmount.getText() + " Tk"

                        + "\nTotal Monthly Expense : " + txtTotalExpense.getText() + " Tk"

        );

    }

    @FXML
    private void clearFormOA() {

        txtMonth.clear();
        txtYear.clear();
        txtCategory.clear();
        txtAmount.clear();
        txtTotalExpense.clear();
        txtSummary.clear();

        expense = null;

    }

    @FXML
    private void goBackOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/com/example/mangogardenestate/estateownerdashboard.fxml",
                "Harvest Summary");

    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Monthly Expense");

        alert.setHeaderText(null);

        alert.setContentText(message);

        alert.showAndWait();

    }

}