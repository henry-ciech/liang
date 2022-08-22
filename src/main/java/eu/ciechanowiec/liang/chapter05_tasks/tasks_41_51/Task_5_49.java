package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class  Task_5_49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowels = 0;
        int consonant = 0;

        System.out.println("Enter a letter:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            String letter = String.valueOf(input.charAt(i));

            if (letter.equalsIgnoreCase("a")
                    || letter.equalsIgnoreCase("e")
                    || letter.equalsIgnoreCase("i")
                    || letter.equalsIgnoreCase("o")
                    || letter.equalsIgnoreCase("u")) {
                vowels++;
            } else if ((letter.charAt(0) >= 'A'
                    && letter.charAt(0) <= 'Z')
                    || (letter.charAt(0) >= 'a'
                    && letter.charAt(0) <= 'z')) {
                consonant++;
            }
        }

        System.out.printf("""
                vowels: %d
                consonant: %d
                """, vowels, consonant);
    }
}
