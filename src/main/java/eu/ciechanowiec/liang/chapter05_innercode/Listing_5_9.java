package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Scanner;

class Listing_5_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second integer:");
        int number2 = scanner.nextInt();
        int gcd = 1;
        int k = 2;

        while (k <= number1 && k <= number2) {
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k;
            }

            k++;
        }

        System.out.printf("The greatest common divisor for %d and %d is %d%n", number1, number2, gcd);
    }
}
