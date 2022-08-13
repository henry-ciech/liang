package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 2);

        System.out.println("Choose: head or tail?");
        String guess = scanner.nextLine();

        int guessInNum = (guess.equals("head"))? 0: 1;

        if (number == guessInNum) {
            System.out.println("You are right");
        } else {
            System.out.println("You are wrong");
        }
    }
}
