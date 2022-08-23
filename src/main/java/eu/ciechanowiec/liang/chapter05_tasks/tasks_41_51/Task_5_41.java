package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double max = 0;
        double number = -1;

        System.out.println("Enter number by one (0 - end):");

        while (number != 0) {
            number = scanner.nextDouble();

            if (number > max) {
                count = 0;
                max =  number;
            }

            if (number == max) {
                count++;
            }
        }

        System.out.printf("""
                The largest number is %.1f
                The occurrence count of the largest number is %d
                """, max, count);
    }
}
