package eu.ciechanowiec.liang.chapter10_innercode.listing_10_10;

import java.util.Scanner;

class Listing_10_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \nis "
                + input + " a palindrome? " + isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        String input1 = filter(input);
        String input2 = reverse(input1);
        return input2.equals(input1);
    }

    private static String filter(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetterOrDigit(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
