package com.example.mangogardenestate.EstateOwnerModelclass;

public class OperationalReport {

    private String reportId;
    private String category;
    private String production;
    private String sales;
    private String status;

    public OperationalReport() {
    }

    public OperationalReport(String reportId,
                             String category,
                             String production,
                             String sales,
                             String status) {

        this.reportId = reportId;
        this.category = category;
        this.production = production;
        this.sales = sales;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}