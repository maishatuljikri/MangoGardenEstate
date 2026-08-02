package com.example.mangogardenestate.maisha2330841.nonuser;



import java.io.Serializable;
import java.time.LocalDate;

public class IrrigationCompletionStatus implements Serializable {

    private String irrigationId;
    private String section;
    private LocalDate irrigationDate;
    private double duration;
    private double waterUsed;
    private String status;
    private String remarks;

    public IrrigationCompletionStatus(String irrigationId,
                                      String section,
                                      LocalDate irrigationDate,
                                      double duration,
                                      double waterUsed,
                                      String status,
                                      String remarks) {

        this.irrigationId = irrigationId;
        this.section = section;
        this.irrigationDate = irrigationDate;
        this.duration = duration;
        this.waterUsed = waterUsed;
        this.status = status;
        this.remarks = remarks;
    }

    public String getIrrigationId() {
        return irrigationId;
    }

    public String getSection() {
        return section;
    }

    public LocalDate getIrrigationDate() {
        return irrigationDate;
    }

    public double getDuration() {
        return duration;
    }

    public double getWaterUsed() {
        return waterUsed;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }
}
