package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_6 {

    private static final Double KILOGRAMS_PER_POUND = 0.45359237;
    private static final Double METERS_PER_INCH = 0.3048;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pound:");
        double weightInPounds = scanner.nextDouble();
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;

        System.out.println("Enter feet:");
        int feet = scanner.nextInt();

        System.out.println("Enter inches: ");
        int inches = scanner.nextInt();

        double heightInInches = feet + inches / 100.0;
        double heightInMeters = heightInInches * METERS_PER_INCH;

        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + (int) (bmi * 100) / 100.0);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
