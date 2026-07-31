package com.example.mangogardenestate.Modelclass3;

public class MonthlyExpense {

    private String month;
    private String year;
    private String category;
    private double amount;
    private double totalExpense;

    public MonthlyExpense() {
    }

    public MonthlyExpense(String month, String year, String category,
                          double amount, double totalExpense) {
        this.month = month;
        this.year = year;
        this.category = category;
        this.amount = amount;
        this.totalExpense = totalExpense;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }
}
