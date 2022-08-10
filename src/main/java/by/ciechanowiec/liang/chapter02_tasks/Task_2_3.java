package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for feet");
        final double FOOT = scanner.nextDouble();

        double meters = FOOT * 0.305;
        System.out.println(FOOT + " feet is " + meters + " meters");
    }
}
