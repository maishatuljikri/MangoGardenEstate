package com.example.mangogardenestate.Modelclass3;

public class WarehouseStock {

    private String stockId;
    private String variety;
    private String section;
    private double quantity;
    private String status;

    public WarehouseStock() {
    }

    public WarehouseStock(String stockId, String variety,
                          String section, double quantity,
                          String status) {
        this.stockId = stockId;
        this.variety = variety;
        this.section = section;
        this.quantity = quantity;
        this.status = status;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}