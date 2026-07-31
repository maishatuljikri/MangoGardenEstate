package com.example.mangogardenestate.Modelclass3;

public class DailySales {

    private String salesId;
    private String salesDate;
    private String customerName;
    private double quantity;
    private double amount;

    public DailySales() {
    }

    public DailySales(String salesId, String salesDate,
                      String customerName, double quantity, double amount) {
        this.salesId = salesId;
        this.salesDate = salesDate;
        this.customerName = customerName;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
