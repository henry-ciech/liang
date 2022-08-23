package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input1 = new StringBuilder();

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        input1.append(input);
        input1.reverse();

        System.out.printf("The reversed string is %s%n", input1);
    }
}
