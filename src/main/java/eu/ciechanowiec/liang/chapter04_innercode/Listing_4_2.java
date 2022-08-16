package eu.ciechanowiec.liang.chapter04_innercode;

import java.util.Scanner;

class Listing_4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String city1 = scanner.nextLine();

        System.out.println("Enter the second city:");
        String city2 = scanner.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabet order are " + city1 + " " + city2);
        } else {
            System.out.println("The cities in alphabet order are " + city2 + " " + city1);
        }
    }
}
