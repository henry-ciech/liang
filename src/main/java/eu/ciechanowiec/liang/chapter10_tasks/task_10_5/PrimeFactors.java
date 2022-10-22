package eu.ciechanowiec.liang.chapter10_tasks.task_10_5;

import eu.ciechanowiec.liang.chapter10_innercode.listing_10_7_8.StackOfIntegers;

class PrimeFactors {

    private int number;

    PrimeFactors(int number) {
        this.number = number;
    }

    void smallestFactors(StackOfIntegers stack) {
        int primeFactor = 2;
        while (number / primeFactor != 1){
            if (number % primeFactor == 0) {
                stack.push(primeFactor);
                number /= primeFactor;
            } else {
                primeFactor++;
            }
        }
        stack.push(number);
    }
}
