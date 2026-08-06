package com.example.mangogardenestate.maisha2330841.nonuser;

import java.time.LocalDate;

public class MangoOrder {

    private String customerId;
    private String mangoType;
    private double price;
    private int stock;
    private int quantity;
    private LocalDate deliveryDate;
    private String address;

    public MangoOrder(String customerId,
                      String mangoType,
                      double price,
                      int stock,
                      int quantity,
                      LocalDate deliveryDate,
                      String address) {

        this.customerId = customerId;
        this.mangoType = mangoType;
        this.price = price;
        this.stock = stock;
        this.quantity = quantity;
        this.deliveryDate = deliveryDate;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMangoType() {
        return mangoType;
    }

    public void setMangoType(String mangoType) {
        this.mangoType = mangoType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /** Convenience total cost for this order. */
    public double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "MangoOrder{" +
                "customerId='" + customerId + '\'' +
                ", mangoType='" + mangoType + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", quantity=" + quantity +
                ", deliveryDate=" + deliveryDate +
                ", address='" + address + '\'' +
                '}';
    }
}