package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            StringBuilder reverse = new StringBuilder();
            reverse.append(number);

            reverse.reverse();

            System.out.printf("%s ", reverse);
        }

        System.out.println();
    }
}
