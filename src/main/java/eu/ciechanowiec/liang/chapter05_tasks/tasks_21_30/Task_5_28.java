package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

import java.util.Scanner;

class Task_5_28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Enter the first day of the year: ");
        int firstDay = scanner.nextInt();

        int numberOfDaysInMonth = 0;

        String firstDayString = "";

        for (int month = 1; month <= 12; month++) {
            switch (month) {

                case 1: System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 2: System.out.print("February 1, " + year + " is ");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 3: System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 4: System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 5: System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 6: System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 7: System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 8: System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 9: System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 10: System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 11: System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 12: System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;
            }

            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }

    static String firstDay(int firstDay) {

        return switch (firstDay) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "";
        };
    }
}
