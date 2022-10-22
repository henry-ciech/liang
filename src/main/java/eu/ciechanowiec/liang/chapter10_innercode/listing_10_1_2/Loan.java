package eu.ciechanowiec.liang.chapter10_innercode.listing_10_1_2;

import java.util.Date;

class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    int getNumberOfYears() {
        return numberOfYears;
    }

    double getLoanAmount() {
        return loanAmount;
    }

    Date getLoanDate() {
        return loanDate;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12.0)));
    }

    double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
