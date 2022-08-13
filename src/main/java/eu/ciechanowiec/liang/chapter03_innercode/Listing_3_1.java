package eu.ciechanowiec.liang.chapter03_innercode;

import java.util.Scanner;

class Listing_3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        System.out.println("What is " + number1 + " + " + number2 + " ?");
        int answer = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
