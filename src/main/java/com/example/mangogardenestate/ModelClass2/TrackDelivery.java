package com.example.mangogardenestate.ModelClass2;



public class TrackDelivery {

    private String orderId;
    private String deliveryId;
    private String address;
    private String deliveryDate;
    private String status;
    private String deliveryPerson;

    public TrackDelivery() {
    }

    public TrackDelivery(String orderId, String deliveryId,
                         String address, String deliveryDate,
                         String status, String deliveryPerson) {
        this.orderId = orderId;
        this.deliveryId = deliveryId;
        this.address = address;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.deliveryPerson = deliveryPerson;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public String getAddress() {
        return address;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }
}