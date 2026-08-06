package com.example.mangogardenestate.EstateOwnerModelclass;


public class HarvestSummary {

    private String harvestId;
    private String harvestDate;
    private String section;
    private String variety;
    private int quantity;

    public HarvestSummary() {
    }

    public HarvestSummary(String harvestId,
                          String harvestDate,
                          String section,
                          String variety,
                          int quantity) {

        this.harvestId = harvestId;
        this.harvestDate = harvestDate;
        this.section = section;
        this.variety = variety;
        this.quantity = quantity;
    }

    public String getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(String harvestId) {
        this.harvestId = harvestId;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

