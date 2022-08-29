package eu.ciechanowiec.liang.chapter06_innercode;

import java.util.Scanner;

class Listing_6_12 {

    private static final int START_DAY_FOR_JAN_1_1800 = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ful year (e.g., 2012):");
        int year = scanner.nextInt();

        System.out.println("Enter Month as a number between 1 and 12:");
        int month = scanner.nextInt();

        printMonth(year, month);
    }

    static void printMonth(int year, int month) {
        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

    static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month)
                        + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    static String getMonthName(int month) {
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

    static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);

        int numberOfDaysIMonth = getTotalNumbersOfDaysInMonth(year, month);

        int i = 0;
        for(i = 0; i < startDay; i++) {
            System.out.println("\t");
        }

        for (i = 1; i <= numberOfDaysIMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    static int getStartDay(int year, int month) {
        int totalNumberOfDays = getTotalNumbersOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    static int getTotalNumbersOfDays(int year, int month) {
        int total = 0;

        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }

        for (int i = 1; i < month; i++) {
            total += getTotalNumbersOfDaysInMonth(year, i);
        }

        return total;
    }

    static int getTotalNumbersOfDaysInMonth(int year, int month) {
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

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
