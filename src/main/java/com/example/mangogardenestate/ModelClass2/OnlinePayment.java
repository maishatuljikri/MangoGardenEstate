package com.example.mangogardenestate.ModelClass2;

import java.io.Serializable;
import java.time.LocalDate;

public class OnlinePayment implements Serializable {

    private String orderId;
    private double amount;
    private String paymentMethod;
    private String accountNumber;
    private String holderName;
    private String pin;
    private LocalDate paymentDate;

    public OnlinePayment(String orderId,
                         double amount,
                         String paymentMethod,
                         String accountNumber,
                         String holderName,
                         String pin,
                         LocalDate paymentDate) {

        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.pin = pin;
        this.paymentDate = paymentDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getPin() {
        return pin;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    @Override
    public String toString() {
        return orderId + " " + amount + " " + paymentMethod;
    }
}