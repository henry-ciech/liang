package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        reverse(number);
    }

    private static void reverse(int number) {
        StringBuilder input = new StringBuilder();

        input.append(number);
        input.reverse();
        System.out.printf("Reverse is %s", input);
    }
}
