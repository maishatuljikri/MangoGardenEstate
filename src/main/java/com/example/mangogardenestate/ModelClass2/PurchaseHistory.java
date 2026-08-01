package com.example.mangogardenestate.ModelClass2;



public class PurchaseHistory {

    private String orderId;
    private String orderDate;
    private String mangoType;
    private double quantity;
    private double amount;
    private String paymentStatus;
    private String deliveryStatus;

    public PurchaseHistory() {
    }

    public PurchaseHistory(String orderId,
                           String orderDate,
                           String mangoType,
                           double quantity,
                           double amount,
                           String paymentStatus,
                           String deliveryStatus) {

        this.orderId = orderId;
        this.orderDate = orderDate;
        this.mangoType = mangoType;
        this.quantity = quantity;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.deliveryStatus = deliveryStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getMangoType() {
        return mangoType;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }
}
