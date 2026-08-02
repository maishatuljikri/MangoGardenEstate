package com.example.mangogardenestate.maisha2330841.nonuser;



import java.io.Serializable;
import java.time.LocalDate;

public class ProductReview implements Serializable {

    private String customerId;
    private String orderId;
    private String mangoVariety;
    private String rating;
    private String review;
    private LocalDate reviewDate;

    public ProductReview() {
    }

    public ProductReview(String customerId, String orderId,
                         String mangoVariety, String rating,
                         String review, LocalDate reviewDate) {

        this.customerId = customerId;
        this.orderId = orderId;
        this.mangoVariety = mangoVariety;
        this.rating = rating;
        this.review = review;
        this.reviewDate = reviewDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getMangoVariety() {
        return mangoVariety;
    }

    public String getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    @Override
    public String toString() {
        return "Customer ID : " + customerId +
                "\nOrder ID : " + orderId +
                "\nMango : " + mangoVariety +
                "\nRating : " + rating +
                "\nReview : " + review +
                "\nDate : " + reviewDate;
    }
}