package com.example.mangogardenestate.maisha2330841.nonuser;

public class SalaryInformation {

    private String salaryId;
    private String month;
    private double basicSalary;
    private double overtime;
    private double bonus;
    private double deduction;
    private double netSalary;

    public SalaryInformation(String salaryId,
                             String month,
                             double basicSalary,
                             double overtime,
                             double bonus,
                             double deduction) {

        this.salaryId = salaryId;
        this.month = month;
        this.basicSalary = basicSalary;
        this.overtime = overtime;
        this.bonus = bonus;
        this.deduction = deduction;
        this.netSalary = basicSalary + overtime + bonus - deduction;
    }

    public String getSalaryId() {
        return salaryId;
    }

    public String getMonth() {
        return month;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getOvertime() {
        return overtime;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getNetSalary() {
        return netSalary;
    }
}
