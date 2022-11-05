package eu.ciechanowiec.liang.chapter10_tasks.task_10_5;

import eu.ciechanowiec.liang.chapter10_innercode.listing_10_7_8.StackOfIntegers;

import java.util.Scanner;

class PrimeFactorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        PrimeFactors prime = new PrimeFactors(scanner.nextInt());
        StackOfIntegers stack = new StackOfIntegers();

        prime.smallestFactors(stack);
        System.out.print("PrimeFactors: ");

        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }

        System.out.println();
    }
}
