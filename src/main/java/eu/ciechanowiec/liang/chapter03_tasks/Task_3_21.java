package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Enter month:");
        int month = scanner.nextInt();

        System.out.println("Enter the day of the month (1-31):");
        int dayOfMonth = scanner.nextInt();

        if (month == 1) {
            month = 13;
            year -= 1;
        } else if (month == 2) {
            month = 14;
            year -= 1;
        }

        int yearDivide100 = year / 100;
        int century = year % 100;


        int dayOfWeek = (dayOfMonth + 26 * (month + 1) / 10 + century + century / 4 + yearDivide100 / 4 + 5 * yearDivide100) % 7;

        switch (dayOfWeek) {
            case 0 -> System.out.print("Day of the week is Saturday ");
            case 1 -> System.out.print("Day of the week is  Sunday");
            case 2 -> System.out.print("Day of the week is  Monday");
            case 3 -> System.out.print("Day of the week is  Tuesday");
            case 4 -> System.out.print("Day of the week is  Wednesday");
            case 5 -> System.out.print("Day of the week is  Thursday");
            case 6 -> System.out.print("Day of the week is  Friday");
        }
    }
}
