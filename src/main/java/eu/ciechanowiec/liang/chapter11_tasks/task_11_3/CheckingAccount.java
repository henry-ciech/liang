package eu.ciechanowiec.liang.chapter11_tasks.task_11_3;

import eu.ciechanowiec.liang.chapter09_tasks.task_9_7.Account;

class CheckingAccount extends Account {

    private final int overdraftLimit;

    CheckingAccount(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected void withdraw(double amount)  {
        if (balance - amount < overdraftLimit) {
            System.out.println("Can't withdraw");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "balance " + balance;
    }
}
