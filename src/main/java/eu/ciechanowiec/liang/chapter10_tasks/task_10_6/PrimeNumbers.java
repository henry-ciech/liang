package eu.ciechanowiec.liang.chapter10_tasks.task_10_6;

import eu.ciechanowiec.liang.chapter10_innercode.listing_10_7_8.StackOfIntegers;

class PrimeNumbers {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        findPrime(stack);
    }

    static void findPrime(StackOfIntegers stack) {
        boolean isPrime;
        for (int i = 2; i <= 120; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                stack.push(i);
            }
        }
    }
}
