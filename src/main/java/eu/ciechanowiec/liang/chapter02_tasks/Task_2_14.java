package eu.ciechanowiec.liang.chapter02_tasks;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

class Task_2_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double weightInPounds = scanner.nextDouble();
        double weightInKilograms = weightInPounds * 0.45;

        System.out.println("Enter height in inches");
        double heightInInches = scanner.nextDouble();
        double heightInMeters = heightInInches * 0.0254;
        System.out.println("BMI is " + (int) ((weightInKilograms / Math.pow(heightInMeters, 2) * 1000)) / 1000.0);
    }
}
