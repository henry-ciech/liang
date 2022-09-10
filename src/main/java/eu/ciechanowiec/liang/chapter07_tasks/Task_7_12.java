package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        reverse(numbers);

        System.out.println("Reverse: ");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }

        System.out.println();
    }

    private static void reverse(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            StringBuilder input = new StringBuilder();
            input.append(numbers[i]);
            input.reverse();
            numbers[i] = Integer.parseInt(String.valueOf(input));
        }
    }
}
