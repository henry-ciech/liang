package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

import java.util.Scanner;

class Task_5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputCounter = 0;
        int numberOfPositives = 0;
        int numberOfNegative = 0;
        double total = 0;
        double average = 0;
        double input = -1;

        System.out.println("Enter an integer, the input ends if it is 0:");

        while (true) {
            input = scanner.nextDouble();

            if (input > 0) {
                numberOfPositives++;
            } else if (input < 0) {
                numberOfNegative++;
            } else if (inputCounter > 0) {
                System.out.printf("Number of positives: %d%n", numberOfPositives);
                System.out.printf("Number of negatives: %d%n", numberOfNegative);
                System.out.printf("Total: %4.2f%n", total);
                System.out.printf("Average: %4.2f%n", average / inputCounter);
                break;
            } else {
                System.out.println("No numbers are entered except 0");
                break;
            }

            average += input;
            total += input;
            inputCounter++;
        }
    }
}
