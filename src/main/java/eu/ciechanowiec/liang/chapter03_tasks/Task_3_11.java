package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_11 {

    private static final String HAS_31_DAYS = " has 31 days";
    private static final String HAS_30_DAYS = " has 30 days";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month and the year:");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1 -> System.out.println("January " + year + HAS_31_DAYS);
            case 2 -> {
                if (isLeapYear) {
                    System.out.println("February " + year + " has 29 days");
                } else {
                    System.out.println("February " + year + " has 28 days");
                }
            }
            case 3 -> System.out.println("March " + year + HAS_31_DAYS);
            case 4 -> System.out.println("April " + year + HAS_30_DAYS);
            case 5 -> System.out.println("May " + year + HAS_31_DAYS);
            case 6 -> System.out.println("June " + year + HAS_30_DAYS);
            case 7 -> System.out.println("July " + year + HAS_31_DAYS);
            case 8 -> System.out.println("August " + year + HAS_31_DAYS);
            case 9 -> System.out.println("September " + year + HAS_30_DAYS);
            case 10 -> System.out.println("October " + year + HAS_31_DAYS);
            case 11 -> System.out.println("November " + year + HAS_30_DAYS);
            case 12 -> System.out.println("December " + year + HAS_31_DAYS);
            default -> throw new RuntimeException("Invalid input");
        }
    }
}
