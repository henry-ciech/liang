package eu.ciechanowiec.liang.chapter03_innercode;

import java.util.Scanner;

class Listing_3_4 {

    private static final Double KILOGRAMS_PER_POUND = 0.45359237;
    private static final Double METERS_PER_INCH = 0.0254;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double weightInPounds = scanner.nextDouble();
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;

        System.out.println("Enter height in inches:");
        double heightInInches = scanner.nextDouble();
        double heightInMeters = heightInInches * METERS_PER_INCH;

        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmi);
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
