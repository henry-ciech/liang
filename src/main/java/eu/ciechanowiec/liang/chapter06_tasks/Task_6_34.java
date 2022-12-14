package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full year (e.g., 2012):");
        int year = scanner.nextInt();

        System.out.println("Enter Month as a number between 1 and 12:");
        int month = scanner.nextInt();

        printMonth(year, month);
        System.out.println();
    }

    private static void printMonth(int year, int month) {
        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

    private static void printMonthTitle(int year, int month) {
        System.out.printf("%s %d%n", getMonthName(month), year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1 -> {
                return  "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "Invalid";
            }
        }
    }

    private static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month, 1);

        int numberOfDaysIMonth = getTotalNumbersOfDaysInMonth(year, month);
        for(int i = 0; i < startDay; i++) {
            System.out.println("\t");
        }

        for (int i = 1; i <= numberOfDaysIMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    private static int getStartDay(int year, int month, int day) {

        int yearDivide100 = year / 100;
        int century = year % 100;

        return (day + 26 * (month + 1) / 10 + century + century / 4 + yearDivide100 / 4 + 5 * yearDivide100) % 7;
    }

    private static int getTotalNumbersOfDaysInMonth(int year, int month) {
        if (month == 1
                || month == 3
                || month == 5
                || month == 7
                || month == 8
                || month == 10
                || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            return isLeapYear(year)? 29 : 28;
        }

        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
