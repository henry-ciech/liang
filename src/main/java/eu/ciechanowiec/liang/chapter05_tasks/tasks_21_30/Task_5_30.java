package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

import java.util.Scanner;

class Task_5_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter annual interest:");
        double annualInterest = scanner.nextDouble();
        double monthlyInterestRate = annualInterest / 1200;

        System.out.println("Enter number of month:");
        int numberOfMonth = scanner.nextInt();

        for (int i = 1; i <= numberOfMonth; i++) {
            amount = amount * (1.0 + monthlyInterestRate);
            total += amount;
        }

        System.out.printf("%.3f%n", total);
    }
}
