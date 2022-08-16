package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_17 {

    private final static String HAS_31_DAYS = " has 31 days";
    private final static String HAS_30_DAYS = " has 30 days";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month:");
        String month = scanner.nextLine().toLowerCase();

        System.out.println("Enter a year:");
        int year = scanner.nextInt();


        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case "jan" -> System.out.println("January " + year + HAS_31_DAYS);
            case "feb" -> {
                if (isLeapYear) {
                    System.out.println("February " + year + " has 29 days");
                } else {
                    System.out.println("February " + year + " has 28 days");
                }
            }
            case "mar" -> System.out.println("March " + year + HAS_31_DAYS);
            case "apr" -> System.out.println("April " + year + HAS_30_DAYS);
            case "may" -> System.out.println("May " + year + HAS_31_DAYS);
            case "jun" -> System.out.println("June " + year + HAS_30_DAYS);
            case "jul" -> System.out.println("July " + year + HAS_31_DAYS);
            case "aug" -> System.out.println("August " + year + HAS_31_DAYS);
            case "sep" -> System.out.println("September " + year + HAS_30_DAYS);
            case "oct" -> System.out.println("October " + year + HAS_31_DAYS);
            case "nov" -> System.out.println("November " + year + HAS_30_DAYS);
            case "dec" -> System.out.println("December " + year + HAS_31_DAYS);
            default -> throw new RuntimeException("Invalid input");
        }
    }
}
