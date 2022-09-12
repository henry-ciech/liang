package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println(sort(string));
    }

    private static char[] sort(String input) {
        char[] str = new char[input.length()];

        for (int i = 0; i < str.length; i++) {
            str[i] = input.charAt(i);
        }

        for (int i = 0; i < str.length - 1; i++) {
            char min = str[i];
            int minIndex = i;

            for (int j = i + 1; j < str.length; j++) {
                if (min > str[j]) {
                    min = str[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                str[minIndex] = str[i];
                str[i] =  min;
            }
        }

        return str;
    }
}
