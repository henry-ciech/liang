package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_7_35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String oneMoreGame;
        RandomGenerator random = new Random();
        int guessingWordNumber;
        String letterGuess;

        do {
            guessingWordNumber = random.nextInt(10);
            count = 0;
            String[] words = {"write", "that", "monkey", "programming", "car", "porsche",
                    "book", "supercalifragilisticexpialidocious",
                    "pneumonoultramicroscopicsilicovolcanoconiosis", "floccinaucinihilipilification"}; //last 3 words are real
            String[] wordToGuess = new String[words[guessingWordNumber].length()];
            String[] guessingWord = new String[wordToGuess.length];
            String guessWord = words[guessingWordNumber];

            for (int i = 0; i < guessingWord.length; i++) {
                guessingWord[i] = String.valueOf(words[guessingWordNumber].charAt(i));
            }
            Arrays.fill(wordToGuess, "*");

            while (Arrays.asList(wordToGuess).contains("*")) {
                System.out.print("Enter a letter in word ");
                printArray(wordToGuess);
                printArray(guessingWord);
                letterGuess = scanner.nextLine();
                if (!Arrays.asList(wordToGuess).contains(letterGuess)) {
                    for (int i = 0; i < wordToGuess.length; i++) {
                        if (letterGuess.equals(guessingWord[i])) {
                            wordToGuess[i] = letterGuess;
                        }
                    }

                    if (!Arrays.asList(wordToGuess).contains(letterGuess)) {
                        System.out.printf("%s is not in the list%n", letterGuess);
                        count++;
                    }
                } else if (Arrays.asList(wordToGuess).contains(letterGuess)) {
                    System.out.printf("%s is already in the list%n", letterGuess);
                }
                System.out.println();
            }
            System.out.printf("The word is %s mistakes: %d%n", guessWord, count);
            System.out.println("Do you want to guess another word? Enter y or n");
            oneMoreGame = scanner.nextLine();
        } while (oneMoreGame.equalsIgnoreCase("y"));
    }

    private static void printArray(String[] word) {
        for (String letter : word) {
            System.out.print(letter);
        }
        System.out.printf(":%n");
    }
}
