package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String input1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String input2 = scanner.nextLine();

        if (input1.contains(input2)) {
            System.out.println(input2 + " is a substring of " + input1);
        } else {
            System.out.println(input2 + " is not a substring of " + input1);
        }
    }
}
