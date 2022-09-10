package eu.ciechanowiec.liang.chapter07_innercode;

import java.util.Scanner;

class Listing_7_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Enter the number of items: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.printf("""
                Average: %.1f
                Number of elements above the average: %d
                """, average, count);
    }
}
