package com.example.mangogardenestate.gardenManagerModelclass;

public class FertilizerUsage {

    private String fertilizerId;
    private String fertilizerName;
    private String section;
    private double quantity;
    private String usageDate;

    public FertilizerUsage() {
    }

    public FertilizerUsage(String fertilizerId,
                           String fertilizerName,
                           String section,
                           double quantity,
                           String usageDate) {

        this.fertilizerId = fertilizerId;
        this.fertilizerName = fertilizerName;
        this.section = section;
        this.quantity = quantity;
        this.usageDate = usageDate;
    }

    public String getFertilizerId() {
        return fertilizerId;
    }

    public void setFertilizerId(String fertilizerId) {
        this.fertilizerId = fertilizerId;
    }

    public String getFertilizerName() {
        return fertilizerName;
    }

    public void setFertilizerName(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(String usageDate) {
        this.usageDate = usageDate;
    }
}