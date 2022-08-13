package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by 5 and 6");
        }

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6");
        }

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6, but not both");
        }
    }
}
