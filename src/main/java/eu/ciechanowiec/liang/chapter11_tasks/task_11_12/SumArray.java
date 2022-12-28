package eu.ciechanowiec.liang.chapter11_tasks.task_11_12;

import java.util.ArrayList;
import java.util.Scanner;

class SumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextDouble());
        }

        System.out.printf("sum: %.1f%n", sum(numbers));
    }

    private static double sum(ArrayList<Double> list) {
        double sum = 0;

        for (Double aDouble : list) {
            sum += aDouble;
        }

        return sum;
    }
}
