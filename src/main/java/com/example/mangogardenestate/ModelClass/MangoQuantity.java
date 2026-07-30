package com.example.mangogardenestate.ModelClass;



import java.io.Serializable;
import java.time.LocalDate;

public class MangoQuantity implements Serializable {

    private LocalDate harvestDate;
    private String section;
    private String variety;
    private double quantity;
    private String grade;
    private String remarks;

    public MangoQuantity(LocalDate harvestDate,
                         String section,
                         String variety,
                         double quantity,
                         String grade,
                         String remarks) {

        this.harvestDate = harvestDate;
        this.section = section;
        this.variety = variety;
        this.quantity = quantity;
        this.grade = grade;
        this.remarks = remarks;
    }

    public LocalDate getHarvestDate() {
        return harvestDate;
    }

    public String getSection() {
        return section;
    }

    public String getVariety() {
        return variety;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getGrade() {
        return grade;
    }

    public String getRemarks() {
        return remarks;
    }
}