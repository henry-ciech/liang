package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter monthly saving amount");
        double monthlySaving = scanner.nextDouble();

        double firstMonth = monthlySaving * 1.00417;
        double secondMonth = (monthlySaving  + firstMonth) * 1.00417;
        double thirdMonth = (monthlySaving + secondMonth) * 1.00417;
        double fourthMonth = (monthlySaving + thirdMonth) * 1.00417;
        double fifthMonth = (monthlySaving + fourthMonth) * 1.00417;
        double sixthMonth = (monthlySaving + fifthMonth) * 1.00417;

        System.out.println("After the sixth month, the account value is $" + (int)(sixthMonth * 100) / 100.0);
    }
}
