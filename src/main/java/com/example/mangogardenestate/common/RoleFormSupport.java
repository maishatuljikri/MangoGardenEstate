package com.example.mangogardenestate.common;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

/** Reusable validation, temporary storage, table-report, and navigation helpers. */
public final class RoleFormSupport {
    private RoleFormSupport() { }

    public static void loadStatusOptions(String title, ComboBox<String> statusBox) {
        statusBox.getItems().setAll(statusOptions(title));
    }

    public static boolean retrieve(String formName, TextField reference, TextField details,
                                   ComboBox<String> statusBox, TextArea report) {
        if (reference.getText().trim().length() < 3) {
            show("Validation", "Enter a valid reference or ID (at least 3 characters).");
            return false;
        }
        TemporaryRecordStore.find(formName, reference.getText()).ifPresentOrElse(record -> {
            details.setText(record.details());
            statusBox.setValue(record.status());
            report.setText("Saved record retrieved. You may update and save it again.");
            show("Record Retrieved", "Saved record retrieved successfully.");
        }, () -> {
            details.clear();
            statusBox.setValue(null);
            report.setText("No saved record found. Enter the details, select a status, then save.");
            show("Record Verified", "No saved record found. You may create a new record.");
        });
        return true;
    }

    public static boolean save(String formName, String title, boolean retrieved, TextField reference,
                               TextField details, ComboBox<String> statusBox, TextArea report) {
        if (!retrieved) {
            show("Validation", "Retrieve and verify the record before saving.");
            return false;
        }
        if (details.getText().trim().length() < 5) {
            show("Validation", "Enter meaningful details (at least 5 characters).");
            return false;
        }
        if (statusBox.getValue() == null) {
            show("Validation", "Select a status before saving.");
            return false;
        }
        TemporaryRecordStore.save(formName, reference.getText(), details.getText(), statusBox.getValue());
        report.setText(title + "\n\nReference: " + reference.getText() + "\nDetails: "
                + details.getText() + "\nStatus: " + statusBox.getValue());
        show("Saved", "Information saved successfully.");
        return true;
    }

    public static void viewReport(String formName, String title) {
        var records = TemporaryRecordStore.findAll(formName);
        if (records.isEmpty()) {
            show("Report", "No saved records are available for this page yet.");
            return;
        }
        TableView<TemporaryRecordStore.StoredRecord> table = new TableView<>();
        TableColumn<TemporaryRecordStore.StoredRecord, String> referenceColumn = new TableColumn<>("Reference / ID");
        referenceColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().reference()));
        referenceColumn.setPrefWidth(160);
        TableColumn<TemporaryRecordStore.StoredRecord, String> detailsColumn = new TableColumn<>("Details");
        detailsColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().details()));
        detailsColumn.setPrefWidth(320);
        TableColumn<TemporaryRecordStore.StoredRecord, String> statusColumn = new TableColumn<>("Status");
        statusColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().status()));
        statusColumn.setPrefWidth(110);
        table.getColumns().addAll(referenceColumn, detailsColumn, statusColumn);
        table.setItems(FXCollections.observableArrayList(records));
        table.setPrefHeight(260);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title + " Report");
        alert.setHeaderText("Saved records");
        alert.getDialogPane().setContent(table);
        alert.getDialogPane().setPrefWidth(650);
        alert.showAndWait();
    }

    public static void clear(TextField reference, TextField details, ComboBox<String> statusBox, TextArea report) {
        reference.clear(); details.clear(); statusBox.setValue(null); report.clear();
    }

    public static void goBack(Node node, String dashboardResource) {
        try {
            Parent root = FXMLLoader.load(RoleFormSupport.class.getResource(dashboardResource));
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            show("Navigation", "Could not return to the dashboard.");
        }
    }

    private static void show(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.setTitle(title); alert.setHeaderText(null); alert.showAndWait();
    }

    private static List<String> statusOptions(String title) {
        if (title.contains("Visitor Entry") || title.contains("Employee Entry")) return List.of("Entry", "Exit");
        if (title.contains("Identity")) return List.of("Verified", "Rejected");
        if (title.contains("Incident")) return List.of("Open", "Under Review", "Resolved");
        if (title.contains("Warehouse")) return List.of("Secure", "Attention Required");
        if (title.contains("Vehicle")) return List.of("Pending", "Approved", "Rejected");
        if (title.contains("Patrol")) return List.of("In Progress", "Completed");
        if (title.contains("Daily Security") || title.equals("Packaging Report")) return List.of("Draft", "Generated");
        if (title.contains("Material Availability") || title.contains("Material Inventory")) return List.of("Available", "Low Stock", "Out of Stock");
        if (title.contains("Task Assignment")) return List.of("Assigned", "In Progress", "Completed");
        if (title.contains("Progress")) return List.of("Pending", "In Progress", "Completed");
        if (title.contains("Quality")) return List.of("Passed", "Rework Required", "Rejected");
        if (title.contains("Delivery")) return List.of("Preparing", "Ready for Dispatch", "Dispatched");
        return List.of("Pending", "Completed");
    }
}
