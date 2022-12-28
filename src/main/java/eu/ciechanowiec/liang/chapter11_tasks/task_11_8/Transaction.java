package eu.ciechanowiec.liang.chapter11_tasks.task_11_8;

import java.util.Date;

class Transaction {

    private final Date date;
    private char typeOfTransaction;
    private double amountOfTransaction;
    private double balance;
    private String description;

    Transaction(double balance, char typeOfTransaction, double amountOfTransaction, String description) {
        this.amountOfTransaction = amountOfTransaction;
        this.typeOfTransaction = typeOfTransaction;
        this.description = description;
        this.balance = balance;
        date = new Date();
    }

    Transaction(double balance, char typeOfTransaction, double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
        this.typeOfTransaction = typeOfTransaction;
        this.balance = balance;
        date = new Date();
    }

    void setAmountOfTransaction(double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }

    double getAmountOfTransaction() {
        return amountOfTransaction;
    }

    void setTypeOfTransaction(char typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    char getTypeOfTransaction() {
        return typeOfTransaction;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }

    String getDate() {
        return date.toString();
    }
}
