package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Scanner;

class Task_5_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        System.out.printf("%nOctal Value: %d%n", convertToOctal(number));
    }

    private static int convertToOctal(int decimalNumber) {
        int octalNumber = 0;
        int countValue = 1;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;

            octalNumber += remainder * countValue;

            countValue = countValue * 10;
            decimalNumber /= 8;
        }

        return octalNumber;
    }
}
