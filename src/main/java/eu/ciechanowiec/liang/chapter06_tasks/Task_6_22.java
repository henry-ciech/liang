package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = input.nextLong();

        System.out.printf("The approximated square root of %.1f is: %d%n", sqrt(number), number );
    }

    private static double sqrt(long n) {
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;

        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return (lastGuess + n / lastGuess) / 2;
    }
}
