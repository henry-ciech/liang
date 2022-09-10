package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        printCombinations(numbers);
    }

    private static void printCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    System.out.printf("%d %d%n", numbers[i], numbers[j]);
                }
            }
        }
    }
}
