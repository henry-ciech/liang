package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Scanner;

class Listing_5_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter an integer (the program ends if it is 0)");
        int data = scanner.nextInt();

        do {
            sum += data;

            System.out.println("Enter an integer (the program ends if it is 0)");
            data = scanner.nextInt();
        } while (data != 0);

        System.out.printf("The sum is %d", sum);
    }
}
