package eu.ciechanowiec.liang.chapter11_tasks.task_11_8;

class testAccount2 {

    public static void main(String[] args) {
        Account2 George = new Account2("George", 1122, 1000, 1.5);

        George.deposit(30);
        George.deposit(40, "From Adam");
        George.deposit(50, "Wage");

        George.withdraw(3);
        George.withdraw(4, "Soda");
        George.withdraw(5);

        System.out.println(George);
        George.printTransaction();
    }
}
