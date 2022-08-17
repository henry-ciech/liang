package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex:");
        double radius = scanner.nextDouble();

        double side = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %4.2f%n", area);
    }
}
