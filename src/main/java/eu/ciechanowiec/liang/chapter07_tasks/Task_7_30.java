package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int[] values = new int[scanner.nextInt()];

        System.out.println("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println("The list has" + (isConsecutiveFour(values) ? " " : " no ") + "consecutive fours");
    }

    private static boolean isConsecutiveFour(int[] values) {
        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                count++;
            }
            if (count >= 4) {
                return true;
            }

            if (values[i] != values[i + 1]) {
                count = 1;
            }
        }
        return false;
    }
}
