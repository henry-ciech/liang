package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class  Task_6_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        int numberOfLetters = countLetters(scanner.nextLine());

        System.out.printf("number of letters: %d", numberOfLetters);
    }

    private static int countLetters(String s) {
        int letterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letterCount++;
            }
        }

        return letterCount;
    }
}
