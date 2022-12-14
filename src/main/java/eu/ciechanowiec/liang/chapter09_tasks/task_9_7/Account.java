package eu.ciechanowiec.liang.chapter09_tasks.task_9_7;

import java.util.Date;

public class Account {

    private int id = 0;
    protected double balance = 0;
    private double annualInterestRate = 0;
    private final Date dateCreated;
    public Account() {
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    String getDateCreated() {
        return dateCreated.toString();
    }

    private double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    protected void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "balance " + balance;
    }
}
