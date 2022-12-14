package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the wind speed ( >= 2) in miles per hour:");
        double windSpeed = scanner.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is " + (int) (windChill * 1000) / 1000.0);
    }
}