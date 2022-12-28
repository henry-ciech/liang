package eu.ciechanowiec.liang.chapter11_tasks.task_11_3;

import eu.ciechanowiec.liang.chapter09_tasks.task_9_7.Account;

class TestAccounts {

    public static void main(String[] args) {
        Account account = new Account();
        SavingAccount savingAccount = new SavingAccount();
        CheckingAccount checkingAccount = new CheckingAccount(-200);

        System.out.println(account);
        System.out.println(savingAccount);
        System.out.println(checkingAccount);
    }
}
