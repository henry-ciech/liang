package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the driving distance ");
        double drivingDistance = scanner.nextDouble();

        System.out.println("Enter miles per gallon");
        double milesPerGallon = scanner.nextDouble();

        System.out.println("Enter price per gallon");
        double pricePerGallon = scanner.nextDouble();

        double gallonsNeed = drivingDistance / milesPerGallon;
        double drivingCost = gallonsNeed * pricePerGallon;

        System.out.println("The cost of driving is $" + (int)(drivingCost * 100) / 100.0);
    }
}
