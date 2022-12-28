package eu.ciechanowiec.liang.chapter11_tasks.task_11_8;

import java.util.ArrayList;
import java.util.Date;

class Account2 {

    private String name;
    private int id;
    protected double accountBalance;
    private double annualInterestRate;
    private final Date dateCreated;
    ArrayList<Transaction> transactions;

    Account2(String name, int id, double accountBalance, double annualInterestRate) {
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
        transactions = new ArrayList<>();
        dateCreated = new Date();
        this.name = name;
        this.id = id;
    }

    protected void withdraw(double amount, String description) {
        accountBalance -= amount;
        transactions.add(new Transaction(accountBalance, 'W',  amount, description));
    }

    protected void withdraw(double amount) {
        accountBalance -= amount;
        transactions.add(new Transaction(accountBalance, 'W',  amount));
    }

    void deposit(double amount, String description) {
        accountBalance += amount;
        transactions.add(new Transaction(accountBalance, 'D',  amount, description));
    }

    void deposit(double amount) {
        accountBalance += amount;
        transactions.add(new Transaction(accountBalance, 'D',  amount));
    }

    @Override
    public String toString() {
        return String.format("""
                name: %s
                id: %d
                balance: $%.2f
                annual interest rate: %.1f%%
                created: %s
                """, name, id, accountBalance, annualInterestRate, getDateCreated());
    }

    void printTransaction() {
        for (Transaction transaction : transactions) {
            System.out.printf("""
                            type of transaction: %c
                            amount of transaction: $%.2f
                            balance after transaction: $%.2f
                            description: %s%n
                            """, transaction.getTypeOfTransaction(), transaction.getAmountOfTransaction(),
                    transaction.getBalance(), transaction.getDescription());
        }
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    int getId() {
        return id;
    }

    void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    String getName() {
        return name;
    }

    double getAccountBalance() {
        return accountBalance;
    }
}
