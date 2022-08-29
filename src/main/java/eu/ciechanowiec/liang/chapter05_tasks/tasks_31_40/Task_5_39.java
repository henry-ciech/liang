package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

class Task_5_39 {

    public static void main(String[] args) {
        double commission = 0;
        double salesAmount = 0;

        while (salesAmount - commission < 30000) {
            if (salesAmount >= 10000.01) {
                commission = salesAmount * 0.12;
            } else if (salesAmount >= 5000.01 && salesAmount < 10000) {
                commission = salesAmount * 0.10;
            } else if (salesAmount <= 5000) {
                commission = salesAmount * 0.08;
            }
            salesAmount += 0.01;
        }

        System.out.printf("You need $%.2f sales to earn $30,000%n", salesAmount);
    }
}
