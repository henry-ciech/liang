package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Enter month:");
        int m = scanner.nextInt();

        System.out.println("Enter the day of the month: 1-31:");
        int q = scanner.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        } else if (m == 2) {
            m = 14;
            year -= 1;
        }

        int j = year / 100;
        int k = year % 100;


        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        switch (h) {
            case 0 -> {
                System.out.print("Day of the week is Saturday ");
            }
            case 1 -> {
                System.out.print("Day of the week is  Sunday");
            }
            case 2 -> {
                System.out.print("Day of the week is  Monday");
            }
            case 3 -> {
                System.out.print("Day of the week is  Tuesday");
            }
            case 4 -> {
                System.out.print("Day of the week is  Wednesday");
            }
            case 5 -> {
                System.out.print("Day of the week is  Thursday");
            }
            case 6 -> {
                System.out.print("Day of the week is  Friday");
            }
        }
    }
}
