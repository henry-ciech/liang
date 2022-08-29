package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Scanner;

class Listing_5_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal value:");
        int decimal = scanner.nextInt();

        String hex = " ";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            char hexDigit = (0 <= hexValue && hexValue <= 9)? (char) (hexValue + '0') :
                    (char) (hexValue - 10 + 'a');

            hex = hexDigit + hex;
            decimal = decimal / 16;
        }

        System.out.printf("The hex number is %s%n", hex);
    }
}
