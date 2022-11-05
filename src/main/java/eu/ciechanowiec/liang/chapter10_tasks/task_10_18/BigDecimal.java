package eu.ciechanowiec.liang.chapter10_tasks.task_10_18;

import java.math.BigInteger;

class BigDecimal {

    private static final int NUMBER_OF_PRIMES = 5;

    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;

        System.out.println();
        while (count < NUMBER_OF_PRIMES) {
            number = BigInteger.valueOf(1).add(number);
            if (isPrime(number)){
                count++;
                System.out.println(number);
            }
        }
    }

    static boolean isPrime(BigInteger number) {
        for (BigInteger traversNumber = BigInteger.valueOf(2);
             traversNumber.compareTo(number.divide(BigInteger.valueOf(2))) <= 0;
             traversNumber = traversNumber.add(BigInteger.valueOf(1))) {
            BigInteger remainder = number.remainder(traversNumber);
            if (remainder.compareTo(BigInteger.valueOf(0)) == 0) {
                return false;
            }
        }
        return true;
    }
}
