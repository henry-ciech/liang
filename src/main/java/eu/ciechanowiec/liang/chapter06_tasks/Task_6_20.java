package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class  Task_6_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        int numberOfLetters = countLetters(scanner.nextLine());

        System.out.printf("Number of letters: %d%n", numberOfLetters);
    }

    private static int countLetters(CharSequence input) {
        int letterCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letterCount++;
            }
        }

        return letterCount;
    }
}
