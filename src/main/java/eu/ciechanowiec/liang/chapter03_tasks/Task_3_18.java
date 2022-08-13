package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in pounds:");
        double weight = scanner.nextDouble();

        if (weight > 0 && weight <= 1) {
            System.out.println("cost: 3.5 dollars");
        } else if (weight > 1 && weight <= 3) {
            System.out.println("cost: 5.5 dollars");
        } else if (weight > 3 && weight <= 10) {
            System.out.println("cost: 8.5 dollars");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("cost: 10.5 dollars");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped");
        } else {
            System.out.println("Invalid input");
        }
    }
}
