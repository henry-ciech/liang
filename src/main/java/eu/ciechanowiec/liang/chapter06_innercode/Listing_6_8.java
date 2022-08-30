package eu.ciechanowiec.liang.chapter06_innercode;

import java.util.Scanner;

class Listing_6_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a hex number:");
        String hex = scanner.nextLine();

        System.out.printf("The decimal value for hex number %s is %d", hex, hexToDecimal(hex.toUpperCase()));
    }

    private static int hexToDecimal(String hex) {
        int decimalValue = 0;

        for (int i = 0; i < hex.length();  i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
