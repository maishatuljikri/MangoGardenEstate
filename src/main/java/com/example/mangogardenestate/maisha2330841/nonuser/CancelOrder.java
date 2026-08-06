package com.example.mangogardenestate.maisha2330841.nonuser;


import java.time.LocalDate;

public class CancelOrder {

    private String orderId;
    private String status;
    private LocalDate cancelDate;
    private String reason;
    private String comments;

    public CancelOrder(String orderId, String status, LocalDate cancelDate,
                       String reason, String comments) {
        this.orderId = orderId;
        this.status = status;
        this.cancelDate = cancelDate;
        this.reason = reason;
        this.comments = comments;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getCancelDate() {
        return cancelDate;
    }

    public String getReason() {
        return reason;
    }

    public String getComments() {
        return comments;
    }
}
