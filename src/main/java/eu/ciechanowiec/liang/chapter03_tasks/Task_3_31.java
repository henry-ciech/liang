package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

public class Task_3_31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB:");
        double rate = scanner.nextDouble();

        System.out.println("""
                Choose:
                0 - convert from dollars to RBM
                1 - convert from RBM to dollars
                """);
        int chooseConvert = scanner.nextInt();

        if (chooseConvert == 0) {
            System.out.println("Enter the dollar amount:");
            double dollarAmount = scanner.nextDouble();

            double dollarToYuan = (int) (dollarAmount * rate * 100) / 100.0;

            System.out.println("$" + dollarAmount + " is " + dollarToYuan + " yuan");
        } else if (chooseConvert == 1) {
            System.out.println("Enter the RMB amount:");
            double yuanAmount = scanner.nextDouble();

            double yuanToDollar = (int) (yuanAmount / rate * 100) / 100.0 ;

            System.out.println(yuanAmount + " yuan is $" + yuanToDollar);
        } else {
            System.out.println("Invalid input");
        }
    }
}
