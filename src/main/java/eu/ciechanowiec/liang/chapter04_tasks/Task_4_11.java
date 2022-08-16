package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex;
        System.out.println("Enter a decimal value (0 to 15): ");
        int number = scanner.nextInt();

        if (number <= 9) {
            hex = Character.toString((char) (number + '0'));
        } else {
             hex = Character.toString((char) (number - 10 + 'A'));
        }

        System.out.println("The hex value is " + hex);
    }
}

