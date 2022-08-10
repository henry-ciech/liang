package by.ciechanowiec.liang.chapter02_innercode;

import java.util.Scanner;

class Listing_2_4 {

    public static void main(String[] args) {
        final double PI = 3.141592;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius" + radius + " is " + area);
    }
}
