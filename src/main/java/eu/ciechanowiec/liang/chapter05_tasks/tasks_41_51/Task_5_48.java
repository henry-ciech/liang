package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i+=2) {
            output += input.charAt(i);
        }

        System.out.println(output);
    }
}
