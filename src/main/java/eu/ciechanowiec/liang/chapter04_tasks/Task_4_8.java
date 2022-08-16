package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

public class Task_4_8  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an ASCII code (0 - 127):");
        int code = scanner.nextInt();

        char ch = (char) code;
        System.out.println("The character for ASCII code " + code + " is " + ch);
    }
}
