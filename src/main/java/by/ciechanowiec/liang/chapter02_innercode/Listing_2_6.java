package by.ciechanowiec.liang.chapter02_innercode;

import java.util.Scanner;

class Listing_2_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheitDegree = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheitDegree - 32);
        System.out.println("Fahrenheit " + fahrenheitDegree + " is " + celsius + " in celsius");
    }
}
