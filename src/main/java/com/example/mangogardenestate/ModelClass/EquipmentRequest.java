package com.example.mangogardenestate.ModelClass;

import java.io.Serializable;
import java.time.LocalDate;

public class EquipmentRequest implements Serializable {

    private String equipmentName;
    private int quantity;
    private LocalDate requiredDate;
    private String priority;
    private String purpose;

    public EquipmentRequest(String equipmentName,
                            int quantity,
                            LocalDate requiredDate,
                            String priority,
                            String purpose) {

        this.equipmentName = equipmentName;
        this.quantity = quantity;
        this.requiredDate = requiredDate;
        this.priority = priority;
        this.purpose = purpose;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getPurpose() {
        return purpose;
    }
}