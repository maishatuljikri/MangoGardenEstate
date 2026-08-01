package com.example.mangogardenestate.ModelClass2;



import java.time.LocalDate;

public class MangoOrder {

    private String customerId;
    private String mangoVariety;
    private double pricePerKg;
    private double availableStock;
    private double orderQuantity;
    private LocalDate deliveryDate;
    private String deliveryAddress;

    // Default Constructor
    public MangoOrder() {
    }

    // Parameterized Constructor
    public MangoOrder(String customerId, String mangoVariety,
                      double pricePerKg, double availableStock,
                      double orderQuantity, LocalDate deliveryDate,
                      String deliveryAddress) {

        this.customerId = customerId;
        this.mangoVariety = mangoVariety;
        this.pricePerKg = pricePerKg;
        this.availableStock = availableStock;
        this.orderQuantity = orderQuantity;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getMangoVariety() {
        return mangoVariety;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getAvailableStock() {
        return availableStock;
    }

    public double getOrderQuantity() {
        return orderQuantity;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    // Setters
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setMangoVariety(String mangoVariety) {
        this.mangoVariety = mangoVariety;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setAvailableStock(double availableStock) {
        this.availableStock = availableStock;
    }

    public void setOrderQuantity(double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    // Calculate Total Price
    public double getTotalPrice() {
        return pricePerKg * orderQuantity;
    }

    @Override
    public String toString() {
        return "MangoOrder{" +
                "customerId='" + customerId + '\'' +
                ", mangoVariety='" + mangoVariety + '\'' +
                ", pricePerKg=" + pricePerKg +
                ", availableStock=" + availableStock +
                ", orderQuantity=" + orderQuantity +
                ", deliveryDate=" + deliveryDate +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}