package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three digit integer");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit3 = number % 10;

        if (digit1 == digit3) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
