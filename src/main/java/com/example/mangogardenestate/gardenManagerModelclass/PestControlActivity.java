package com.example.mangogardenestate.gardenManagerModelclass;

public class PestControlActivity {

    private String recordId;
    private String gardenArea;
    private String pesticide;
    private double quantity;
    private String applicationDate;

    public PestControlActivity() {
    }

    public PestControlActivity(String recordId,
                               String gardenArea,
                               String pesticide,
                               double quantity,
                               String applicationDate) {

        this.recordId = recordId;
        this.gardenArea = gardenArea;
        this.pesticide = pesticide;
        this.quantity = quantity;
        this.applicationDate = applicationDate;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(String gardenArea) {
        this.gardenArea = gardenArea;
    }

    public String getPesticide() {
        return pesticide;
    }

    public void setPesticide(String pesticide) {
        this.pesticide = pesticide;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}