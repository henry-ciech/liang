package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scanner.nextLine();

        System.out.println("First character: " + input.charAt(0) + " string length: " + input.length());
    }
}
