package eu.ciechanowiec.liang.chapter10_innercode.listing_10_9;

import java.util.Scanner;
import java.math.*;

class LargeFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        System.out.println(number +"! is \n" + factorial(number));
    }

    private static BigInteger factorial(long number) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger(i + ""));
            if(i == 200_000) {
                System.out.println("1");
            } else if(i == 300_000) {
                System.out.println("2");
            } else if(i == 500_000) {
                System.out.println("3");
            } else if(i == 800_000) {
                System.out.println("4");
            } else if(i == 900_000) {
                System.out.println("5");
            }
        }

        return result;
    }
}
