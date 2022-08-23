package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double squareTotal = 0.0;

        System.out.println("Enter a number:");

        for (int i = 0; i < 10; i++) {
            double number = scanner.nextDouble();
            total += number;
            squareTotal += Math.pow(number, 2.0);
        }
        double deviation = Math.pow((squareTotal - total * total / 10.0) / 9.0, 0.5);
        double mean = total / 10.0;

        System.out.printf("""
                The mean is %.3f
                The standard deviation is %.3f
                """, mean, deviation);
    }
}
