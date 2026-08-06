package com.example.mangogardenestate.maisha2330841.nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class recordharvestmangoquantity implements Serializable {

    private LocalDate harvestDate;
    private String section;
    private String variety;
    private double quantity;
    private String grade;
    private String remarks;

    public recordharvestmangoquantity(LocalDate harvestDate,
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

    @Override
    public String toString() {
        return "Harvest{" +
                "Date=" + harvestDate +
                ", Section='" + section + '\'' +
                ", Variety='" + variety + '\'' +
                ", Quantity=" + quantity +
                ", Grade='" + grade + '\'' +
                ", Remarks='" + remarks + '\'' +
                '}';
    }
}