package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

class Task_5_39 {

    private static final double COMMISSION_SOUGHT = 30000;

    public static void main(String[] args) {
        double salesAmount;
        double commission;
        double balance;

        salesAmount = 0;

        do {
            balance = commission = 0;
            salesAmount += 0.01;

            if (salesAmount > 10000) {
                commission += (balance = salesAmount - 10000) * 0.12;
            }

            if (salesAmount > 5000) {
                commission += (balance -= balance - 5000) * 0.10;
            }

            if (salesAmount > 0) {
                commission += balance * 0.08;
            }

        } while (commission < COMMISSION_SOUGHT);

        System.out.printf("Minimum sales to earn $30,000: $%.0f%n", salesAmount);
    }
}
