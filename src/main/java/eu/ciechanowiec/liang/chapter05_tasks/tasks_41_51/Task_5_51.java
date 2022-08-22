package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String prefix = "";

        System.out.println("Enter the first string:");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String input2 = scanner.nextLine();


        while (input1.charAt(i) == input2.charAt(i)) {
            prefix += input1.charAt(i);
            i++;
        }

        if (prefix.length() > 0)
            System.out.printf("The common prefix is %s", prefix);
        else
            System.out.printf("%s and %s have no common prefix", input1, input2);
    }
}
