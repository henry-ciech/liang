package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

import java.util.Scanner;

class Task_5_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = input.nextInt();

        int denominator = Math.min(num1, num2);

        for (; denominator > 0; denominator--)
            if (num1 % denominator == 0 && num2 % denominator == 0) {
                break;
            }

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + denominator);
    }
}
