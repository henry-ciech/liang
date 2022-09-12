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

        System.out.println("Reverse: ");
        reverse(numbers);

        System.out.println();
    }

    private static void reverse(int[] numbers) {

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
