package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        int count = 0;
        int countAboveAverage = 0;
        int countBelowAverage = 0;
        int countEqualAverage = 0;

        int[] numbers = new int[100];

        System.out.println("Enter scores (negative for end):");

        while (true) {
            number = scanner.nextInt();

            if (number < 0) {
                break;
            } else {
                numbers[count] = number;
                sum += number;

                count++;
            }
        }

        if (count > 0) {
            int average = sum / count;

            for (int i = 0; i <= count - 1; i ++) {
                if (numbers[i] > average) {
                    countAboveAverage++;
                } else if (numbers[i] < average) {
                    countBelowAverage++;
                } else {
                    countEqualAverage++;
                }
            }

            System.out.printf("""
                    Average: %d
                    Numbers above average: %d
                    Numbers below average: %d
                    Numbers equal average: %d%n
                    """, average, countAboveAverage, countBelowAverage, countEqualAverage);
        }
    }
}
