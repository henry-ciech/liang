package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Scanner;

class Task_5_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = 0;

        System.out.println("Enter the number:");
        int number  = scanner.nextInt();

        String hex = "";

        while (number > 0) {
            digit = number % 16;

            switch (digit) {
                case 15 -> hex = "F" + hex;
                case 14 -> hex = "E" + hex;
                case 13 -> hex = "D" + hex;
                case 12 -> hex = "C" + hex;
                case 11 -> hex = "B" + hex;
                case 10 -> hex = "A" + hex;
                default -> hex = digit + hex;
            }

            number /= 16;
        }
        System.out.println(hex);
    }
}
