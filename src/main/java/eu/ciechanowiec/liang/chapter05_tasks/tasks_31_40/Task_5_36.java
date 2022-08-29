package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Scanner;

class Task_5_36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integers:"); //0130311997 or 013031997
        int number = scanner.nextInt();
        int d11 = 0;

        for (int i = 1000000000, j = 1; i >= 10; i /=10, j++) {
            d11 += (number % i / (i / 10)) * j;
        }

        d11 %= 11;

        if (d11 == 10) {
            System.out.printf("%dX", number);
        } else {
            System.out.printf("%d%d", number, d11);
        }
    }
}
