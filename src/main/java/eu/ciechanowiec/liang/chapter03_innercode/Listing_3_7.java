package eu.ciechanowiec.liang.chapter03_innercode;

import java.util.Scanner;

class Listing_3_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is a leap year?\n" + isLeapYear);
    }
}
