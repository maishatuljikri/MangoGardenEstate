package com.example.mangogardenestate.maisha2330841.nonuser;

import java.io.Serializable;

public class MangoAvailability implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mangoId;
    private String variety;
    private String price;
    private String stock;
    private String harvestDate;
    private String status;

    public MangoAvailability(String mangoId,
                             String variety,
                             String price,
                             String stock,
                             String harvestDate,
                             String status) {

        this.mangoId = mangoId;
        this.variety = variety;
        this.price = price;
        this.stock = stock;
        this.harvestDate = harvestDate;
        this.status = status;
    }

    public String getMangoId() {
        return mangoId;
    }

    public void setMangoId(String mangoId) {
        this.mangoId = mangoId;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}