package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides:");
        double numberOfSides = scanner.nextDouble();

        System.out.println("Enter the side:");
        double side = scanner.nextDouble();

        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.printf("The area of the polygon is %4.2f", area);
    }
}
