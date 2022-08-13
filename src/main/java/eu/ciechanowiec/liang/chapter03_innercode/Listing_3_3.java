package eu.ciechanowiec.liang.chapter03_innercode;

import java.util.Scanner;

class Listing_3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * number1);

        System.out.println("What is " + number1 + " - " + number2 + " ?");
        int answer = scanner.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
