package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        double interest = balance * (annualInterestRate / 1200);

        System.out.println("The interest is " + (int) (interest * 10) / 10.0);
    }
}
