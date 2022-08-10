package by.ciechanowiec.liang.chapter02_innercode;

import java.util.Scanner;

class Listing_2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.141559;

        System.out.println("The area of the circle of radius " + radius + " is " + area);
    }
}
