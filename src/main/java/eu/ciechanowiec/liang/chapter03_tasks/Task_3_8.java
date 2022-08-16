package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int max = (number1 >= number2 && number1 >= number3)? number1 :
                (number2 >= number1 && number2 >= number3)? number2 : number3;

        int min = (number1 <= number2 && number1 <= number3)? number1:
                (number2 <= number1 && number2 <= number3)? number2 : number3;

        int middle = (number1 < max ^ number1 > min)? number1 : (number2 < max ^ number2 > min)? number2 : number3;

        System.out.println(min + " " + middle + " " + max);
    }
}
