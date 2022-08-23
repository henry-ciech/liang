package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Scanner;

class Task_5_31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount:");
        double depositAmount = scanner.nextDouble();

        System.out.println("Enter annual percentage yield:");
        double monthPercentage = scanner.nextDouble() / 1200 + 1;

        System.out.println("Enter maturity period (number of month)");
        int month = scanner.nextInt();

        System.out.println("\tMonth\tCD Value");

        for (int i = 1; i <= month; i++) {
            depositAmount *= monthPercentage;

            System.out.printf(" %4d   \t%.2f%n", i, depositAmount);
        }

    }
}
