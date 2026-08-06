package com.example.mangogardenestate.EstateOwnerModelclass;

public class DamagedMangoReport {

    private String reportId;
    private String reportDate;
    private String variety;
    private int quantity;
    private String reason;

    public DamagedMangoReport() {
    }

    public DamagedMangoReport(String reportId,
                              String reportDate,
                              String variety,
                              int quantity,
                              String reason) {

        this.reportId = reportId;
        this.reportDate = reportDate;
        this.variety = variety;
        this.quantity = quantity;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
