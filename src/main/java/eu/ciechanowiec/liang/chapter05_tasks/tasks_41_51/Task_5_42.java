package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double commission = 0;
        double salesAmount = 0;

        System.out.println("Enter commission for 5000 and less");
        double commission1 = scanner.nextDouble() / 100.0;

        System.out.println("Enter commission for 5000.01 - 10000");
        double commission2 = scanner.nextDouble() / 100.0;

        System.out.println("Enter commission for 10000.01+");
        double commission3 = scanner.nextDouble() / 100.0;

        for (;salesAmount - commission < 30000; salesAmount++) {
            if (salesAmount >= 10000.01) {
                commission = salesAmount * commission3;
            } else if (salesAmount >= 5000.01 && salesAmount < 10000) {
                commission = salesAmount * commission2;
            } else if (salesAmount <= 5000) {
                commission = salesAmount * commission1;
            }
        }

        System.out.printf("You need $%.2f sales to earn $30.000%n", salesAmount);
    }
}
