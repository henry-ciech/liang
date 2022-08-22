package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperCase = 0;

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCase++;
            }
        }
        System.out.printf("uppercase letters: %d", upperCase);
    }
}
