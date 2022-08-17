package eu.ciechanowiec.liang.chapter04_innercode;

import java.util.Scanner;

class Listing_4_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a hex digit:");
        String hexString = scanner.nextLine();

        if (hexString.length() != 1) {
            throw new RuntimeException("You must enter exactly one character");
        }

        char ch = Character.toUpperCase(hexString.charAt(0));

        if ('A' <= ch && ch <= 'f') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        } else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
