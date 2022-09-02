package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter number 2:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter number 3:");
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    private static void displaySortedNumbers(double num1, double num2, double num3) {
        double max;
        double mid;
        double min;
        double sum = num1 + num2 + num3;

        max = Math.max(num1, Math.max(num2, num3));
        min = Math.min(num1, Math.min(num2, num3));
        mid = sum - max - min;

        System.out.printf("Increasing order: %n%.1f%n%.1f%n%.1f%n", min, mid, max);
    }
}
