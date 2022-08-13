package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;
import java.util.stream.Stream;

class Task_2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");
        int number = scanner.nextInt();

        int lastDigit = number % 10;
        int firstAndMiddleDigit = number / 10;
        int middleDigit = firstAndMiddleDigit % 10;
        int firstDigit = firstAndMiddleDigit / 10;

        int sum = lastDigit + middleDigit + firstDigit;

        System.out.println("The sum of the digits is " + sum);

        int result = Stream.of(String.valueOf(number).split(""))
                            .mapToInt(Integer::valueOf)
                            .sum();
        System.out.println(sum);
    }
}
