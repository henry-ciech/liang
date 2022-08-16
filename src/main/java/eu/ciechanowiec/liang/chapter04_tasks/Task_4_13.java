package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

public class Task_4_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter:");
        String letter = scanner.nextLine();

        if (letter.equalsIgnoreCase("a")
         || letter.equalsIgnoreCase("e")
         || letter.equalsIgnoreCase("i")
         || letter.equalsIgnoreCase("o")
         || letter.equalsIgnoreCase("u")) {
                System.out.println(letter + " is vowel");
        } else if ((letter.charAt(0) >= 'A'
                && letter.charAt(0) <= 'Z')
                || (letter.charAt(0) >= 'a'
                && letter.charAt(0) <= 'z')) {
            System.out.println(letter + " is consonant");
        } else {
            throw new RuntimeException(letter + " is an invalid input");
        }
    }
}
