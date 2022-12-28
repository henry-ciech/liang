package eu.ciechanowiec.liang.chapter11_tasks.task_11_3;

import eu.ciechanowiec.liang.chapter09_tasks.task_9_7.Account;

class SavingAccount extends Account {

    @Override
    protected void withdraw(double amount) {
        if (balance < amount ) {
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
