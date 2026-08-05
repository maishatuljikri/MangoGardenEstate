package com.example.mangogardenestate.Modelclass4;


public class IrrigationActivity {

    private String irrigationId;
    private String zone;
    private String date;
    private double waterQuantity;
    private String supervisor;

    public IrrigationActivity() {
    }

    public IrrigationActivity(String irrigationId,
                              String zone,
                              String date,
                              double waterQuantity,
                              String supervisor) {

        this.irrigationId = irrigationId;
        this.zone = zone;
        this.date = date;
        this.waterQuantity = waterQuantity;
        this.supervisor = supervisor;
    }

    public String getIrrigationId() {
        return irrigationId;
    }

    public void setIrrigationId(String irrigationId) {
        this.irrigationId = irrigationId;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(double waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}