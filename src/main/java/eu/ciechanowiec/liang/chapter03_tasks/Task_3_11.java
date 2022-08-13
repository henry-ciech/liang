package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month and the year:");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1 -> {
                System.out.println("January " + year + " has 31 days");
            }
            case 2 -> {
                if (isLeapYear) {
                    System.out.println("February " + year + " has 29 days");
                } else {
                    System.out.println("February " + year + " has 28 days");
                }
            }
            case 3 -> {
                System.out.println("March " + year + " has 31 days");
            }
            case 4 -> {
                System.out.println("April " + year + " has 30 days");
            }
            case 5 -> {
                System.out.println("May " + year + " has 31 days");
            }
            case 6 -> {
                System.out.println("June " + year + " has 30 days");
            }
            case 7 -> {
                System.out.println("July " + year + " has 31 days");
            }
            case 8 -> {
                System.out.println("August " + year + " has 31 days");
            }
            case 9 -> {
                System.out.println("September " + year + " has 30 days");
            }
            case 10 -> {
                System.out.println("October " + year + " has 31 days");
            }
            case 11 -> {
                System.out.println("November " + year + " has 30 days");
            }
            case 12 -> {
                System.out.println("December " + year + " has 31 days");
            }
        }
    }
}
