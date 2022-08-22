package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

import java.util.Scanner;

class Task_5_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        for (int i = 2; i <= number;) {
            if (number % i == 0) {
                System.out.printf("%d ", i);
                number /= i;
            } else {
                i++;
            }
        }
        System.out.printf("%n");
    }
}
