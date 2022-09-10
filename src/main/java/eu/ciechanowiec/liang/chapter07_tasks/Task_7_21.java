package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        int count = 0;
        int sum = 0;

        while (number != 0) {
            number = scanner.nextInt();
            sum += number;
            count++;
        }

        System.out.printf("You entered %d numbers%n", count - 1);
        System.out.printf("The sum of these numbers is %d%n", sum);
    }
}

