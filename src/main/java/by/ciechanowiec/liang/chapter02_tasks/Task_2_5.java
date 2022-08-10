package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate");
        double subtotal = scanner.nextDouble();
        double gratuityPercent = scanner.nextDouble();

        double gratuityDollars = (int)((gratuityPercent / 100) * subtotal * 100) / 100.0;
        double total = subtotal + gratuityDollars;
        System.out.println("The gratuity is $" + gratuityDollars + " and total is " + total);
    }
}
