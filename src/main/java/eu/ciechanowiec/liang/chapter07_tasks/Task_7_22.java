package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_22 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                count++;
            }
        }

        System.out.printf("Tne number of uppercase letters is %d%n", count);
    }
}
