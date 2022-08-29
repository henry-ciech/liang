package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

import java.util.Scanner;

class Task_5_29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Enter the first day of the year: ");
        int startDay = scanner.nextInt();

        int numberOfDaysInMonth = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print(" ".repeat(10));
            switch (month) {
                case 1 -> {
                    System.out.println("January " + year);
                    numberOfDaysInMonth = 31;
                }
                case 2 -> {
                    System.out.println("February " + year);
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        numberOfDaysInMonth = 29;
                    } else {
                        numberOfDaysInMonth = 28;
                    }
                }
                case 3 -> {
                    System.out.println("March " + year);
                    numberOfDaysInMonth = 31;
                }
                case 4 -> {
                    System.out.println("April " + year);
                    numberOfDaysInMonth = 30;
                }
                case 5 -> {
                    System.out.println("May " + year);
                    numberOfDaysInMonth = 31;
                }
                case 6 -> {
                    System.out.println("June " + year);
                    numberOfDaysInMonth = 30;
                }
                case 7 -> {
                    System.out.println("July " + year);
                    numberOfDaysInMonth = 31;
                }
                case 8 -> {
                    System.out.println("August " + year);
                    numberOfDaysInMonth = 31;
                }
                case 9 -> {
                    System.out.println("September " + year);
                    numberOfDaysInMonth = 30;
                }
                case 10 -> {
                    System.out.println("October " + year);
                    numberOfDaysInMonth = 31;
                }
                case 11 -> {
                    System.out.println("November " + year);
                    numberOfDaysInMonth = 30;
                }
                case 12 -> {
                    System.out.println("December " + year);
                    numberOfDaysInMonth = 31;
                }
            }
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }
            for (int i = 1; i <= numberOfDaysInMonth; i++) {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("");

            startDay = (startDay + numberOfDaysInMonth) % 7;
            System.out.println();
        }
    }
}
