package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = scanner.nextLine();

        System.out.println("Enter char:");
        char ch1 = scanner.nextLine().charAt(0);

        System.out.printf("Number of \"%c\": %d", ch1, count(input, ch1));
    }

    static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
