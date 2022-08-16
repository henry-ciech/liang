package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter:");
        int letterCode = scanner.nextLine().toUpperCase().charAt(0);

        if (letterCode >= 65 && letterCode <= 67) {
            System.out.println("The corresponding number is 2");
        } else if (letterCode >= 68 && letterCode <= 70) {
            System.out.println("The corresponding number is 3");
        } else if (letterCode >= 71 && letterCode <= 73) {
            System.out.println("The corresponding number is 4");
        } else if (letterCode >= 74 && letterCode <= 76) {
            System.out.println("The corresponding number is 5");
        } else if (letterCode >= 77 && letterCode <= 79) {
            System.out.println("The corresponding number is 6");
        } else if (letterCode >= 80 && letterCode <= 83) {
            System.out.println("The corresponding number is 7");
        } else if (letterCode >= 84 && letterCode <= 86) {
            System.out.println("The corresponding number is 8");
        } else if (letterCode >= 87 && letterCode <= 90) {
            System.out.println("The corresponding number is 9");
        } else {
            System.out.println("Invalid input");
        }
    }
}
