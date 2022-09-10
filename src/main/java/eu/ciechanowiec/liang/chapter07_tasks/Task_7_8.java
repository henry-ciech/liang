package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersInteger = new int[10];
        double[] numbersDouble = new double[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < numbersInteger.length; i++) {
            numbersInteger[i] = scanner.nextInt();
        }

        System.out.printf("Average: %.0f%n", average(numbersInteger));

        System.out.println("Enter 10 doubles:");

        for (int i = 0; i < numbersDouble.length; i++) {
            numbersDouble[i] = scanner.nextDouble();
        }

        System.out.printf("Average: %.3f%n", average(numbersDouble));
    }

    private static double average(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        System.out.println("Used: int"); //Check
        return sum / array.length; //Task-condition
    }

    private static double average(double[] array) {
        double sum = 0;

        for (double j : array) {
            sum += j;
        }
        System.out.println("Used: double"); //Check
        return sum / array.length;
    }
}
