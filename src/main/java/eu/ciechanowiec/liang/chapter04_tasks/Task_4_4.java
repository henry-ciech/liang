package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

public class Task_4_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side:");
        double side = scanner.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon: %4.2f%n", area);
    }
}
