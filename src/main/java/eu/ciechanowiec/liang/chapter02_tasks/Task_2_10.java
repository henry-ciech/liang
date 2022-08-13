package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms:");
        double amountOfWater = scanner.nextDouble();

        System.out.println("Enter the initial temperature");
        double initialTemperature = scanner.nextDouble();

        System.out.println("Enter the final temperature");
        double finalTemperature = scanner.nextDouble();

        double Q = amountOfWater * (finalTemperature - initialTemperature);

        System.out.println("The energy needed is " + Q);
    }
}
