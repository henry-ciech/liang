package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Map;
import java.util.Scanner;

class Task_2_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter speed and acceleration:");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        double runway = Math.pow(speed, 2) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + (int) (runway * 1000) / 1000.0);
    }
}
