package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Scanner;

class Listing_5_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int low = 0;
        int high = input.length() - 1;
        boolean isPalidrome = true;

        while (low < high) {
            if (input.charAt(low) != input.charAt(high)) {
                isPalidrome = false;
            }

            low++;
            high--;
        }

        if (isPalidrome) {
            System.out.printf("%s is a palindrome%n", input);
        } else {
            System.out.printf("%s is not a palindrome%n", input);
        }
    }
}
