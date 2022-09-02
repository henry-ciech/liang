package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

     private static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16) &&
                        (isPrefixMatched(number, 4) || isPrefixMatched(number, 5) ||
                         isPrefixMatched(number, 37) || isPrefixMatched(number, 6)) &&
                       ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    private static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = String.valueOf(number);
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(String.valueOf(num.charAt(i))) * 2);
        }

        return sum;
    }

    private static int getDigit(int number) {
        if (number < 9) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    private static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = String.valueOf(number);
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return sum;
    }

    private static boolean isPrefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    private static int getSize(long d) {
        String num = String.valueOf(d);
        return num.length();
    }

    private static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = String.valueOf(number);
            return  Long.parseLong(num.substring(0, k));
        }

        return number;
    }
}
