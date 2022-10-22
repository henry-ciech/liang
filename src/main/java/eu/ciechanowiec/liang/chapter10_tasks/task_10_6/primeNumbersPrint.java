package eu.ciechanowiec.liang.chapter10_tasks.task_10_6;

import eu.ciechanowiec.liang.chapter10_innercode.listing_10_7_8.StackOfIntegers;

class primeNumbersPrint {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        PrimeNumbers.findPrime(stack);

        while (!stack.empty()) {
            System.out.printf("%d ", stack.pop());
        }

        System.out.println();
    }
}
