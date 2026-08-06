package com.example.mangogardenestate.maisha2330841.nonuser;



import java.io.Serializable;

public class DownloadInvoice implements Serializable {

    private String orderId;
    private String invoiceId;
    private String customerName;
    private String paymentAmount;
    private String paymentDate;
    private String paymentMethod;

    public DownloadInvoice(String orderId, String invoiceId, String customerName,
                           String paymentAmount, String paymentDate,
                           String paymentMethod) {

        this.orderId = orderId;
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "DownloadInvoice{" +
                "orderId='" + orderId + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}