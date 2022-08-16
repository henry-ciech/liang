package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

public class Task_4_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = scanner.nextLine().charAt(0);

        System.out.println("The Unicode for the character " + ch + " is " + (int) ch);
    }
}
