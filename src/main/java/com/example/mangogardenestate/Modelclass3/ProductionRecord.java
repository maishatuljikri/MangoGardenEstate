package com.example.mangogardenestate.Modelclass3;


public class ProductionRecord {

    private String productionId;
    private String harvestDate;
    private String section;
    private String variety;
    private double quantity;

    public ProductionRecord() {
    }

    public ProductionRecord(String productionId, String harvestDate,
                            String section, String variety, double quantity) {
        this.productionId = productionId;
        this.harvestDate = harvestDate;
        this.section = section;
        this.variety = variety;
        this.quantity = quantity;
    }

    public String getProductionId() {
        return productionId;
    }

    public void setProductionId(String productionId) {
        this.productionId = productionId;
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}