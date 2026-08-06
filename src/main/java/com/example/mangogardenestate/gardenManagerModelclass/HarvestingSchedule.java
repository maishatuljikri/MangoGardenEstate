package com.example.mangogardenestate.gardenManagerModelclass;

public class HarvestingSchedule {

    private String scheduleId;
    private String harvestDate;
    private String gardenZone;
    private String workerName;
    private double quantity;

    public HarvestingSchedule() {
    }

    public HarvestingSchedule(String scheduleId,
                              String harvestDate,
                              String gardenZone,
                              String workerName,
                              double quantity) {

        this.scheduleId = scheduleId;
        this.harvestDate = harvestDate;
        this.gardenZone = gardenZone;
        this.workerName = workerName;
        this.quantity = quantity;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getGardenZone() {
        return gardenZone;
    }

    public void setGardenZone(String gardenZone) {
        this.gardenZone = gardenZone;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}