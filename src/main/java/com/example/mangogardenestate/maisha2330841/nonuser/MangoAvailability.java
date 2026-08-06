package com.example.mangogardenestate.maisha2330841.nonuser;

public class MangoAvailability {

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

    public String getVariety() {
        return variety;
    }

    public String getPrice() {
        return price;
    }

    public String getStock() {
        return stock;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public String getStatus() {
        return status;
    }
}