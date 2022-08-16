package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

public class Task_4_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter grade:");
        String grade = scanner.nextLine().toUpperCase();

        switch (grade) {
            case "A" -> System.out.println("The numeric value for grade A is 4");
            case "B" -> System.out.println("The numeric value for grade B is 3");
            case "C" -> System.out.println("The numeric value for grade C is 2");
            case "D" -> System.out.println("The numeric value for grade D is 1");
            case "F" -> System.out.println("The numeric value for grade F is 0");
            default -> throw new RuntimeException(grade + " is an invalid input");
        }
    }
}
