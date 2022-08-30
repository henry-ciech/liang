package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        String isValidPassword = (isValidLength(password)
                                && isOnlyLettersAndDigits(password)
                                && isTwoDigits(password))? "valid" : "invalid";

        System.out.printf("%s is %s password%n", password, isValidPassword);
    }

    private static boolean isValidLength(String password) {
        return password.length() >= 8;
    }

    private static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean isTwoDigits(String password) {
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
