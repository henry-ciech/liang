package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the side:");
        double length = scanner.nextDouble();

        double area = 3 * Math.pow(3, 0.5) / 2 *  Math.pow(length, 2);
        System.out.println("The area of the hexagon is " + (int) (area * 10000) / 10000.0);
    }
}
