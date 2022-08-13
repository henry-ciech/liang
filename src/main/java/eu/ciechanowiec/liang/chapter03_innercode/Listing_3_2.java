package eu.ciechanowiec.liang.chapter03_innercode;

import java.util.Scanner;

class Listing_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
        
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
