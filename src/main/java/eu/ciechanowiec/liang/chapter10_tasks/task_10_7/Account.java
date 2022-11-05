package eu.ciechanowiec.liang.chapter10_tasks.task_10_7;

class Account {

    private double balance;

    Account() {
        balance = 100;
    }

    double printBalance() {
        return balance;
    }

    void withdraw(double amountToTake) {
        balance -= amountToTake;
    }

    void deposit(double amountToAdd) {
        balance += amountToAdd;
    }
}
