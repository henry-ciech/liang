package eu.ciechanowiec.liang.chapter02_innercode;

import java.util.Scanner;

class Listing_2_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchasedAmount = input.nextDouble();

        double tax = purchasedAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }
}
