package com.example.mangogardenestate.gardenManagerModelclass;

public class DailyActivityReport {

    private String reportId;
    private String reportDate;
    private String irrigation;
    private String fertilizer;
    private String labor;

    public DailyActivityReport() {
    }

    public DailyActivityReport(String reportId,
                               String reportDate,
                               String irrigation,
                               String fertilizer,
                               String labor) {

        this.reportId = reportId;
        this.reportDate = reportDate;
        this.irrigation = irrigation;
        this.fertilizer = fertilizer;
        this.labor = labor;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getIrrigation() {
        return irrigation;
    }

    public void setIrrigation(String irrigation) {
        this.irrigation = irrigation;
    }

    public String getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }
}