package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in pounds");
        final double POUNDS = scanner.nextDouble();

        double kilograms = POUNDS * 0.454;
        System.out.println(POUNDS + " pounds is " + kilograms + " kilograms");
    }
}
