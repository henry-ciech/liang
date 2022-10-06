package eu.ciechanowiec.liang.chapter09_tasks.task_9_7;

class TestAccount {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(0.45);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.printf("""
                Balance: %.1f
                Monthly interest rate: %1f
                Date when account was created: %s
                """, account.getBalance(), account.getAnnualInterestRate(), account.getDateCreated());
    }
}
