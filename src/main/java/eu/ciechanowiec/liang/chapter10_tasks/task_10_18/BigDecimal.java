package eu.ciechanowiec.liang.chapter10_tasks.task_10_18;

import java.math.BigInteger;

class BigDecimal {

    private static final int NUMBER_OF_PRIMES = 5;

    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;

        System.out.println();
        while (count < NUMBER_OF_PRIMES) {
            number = new BigInteger("1").add(number);
            if (isPrime(number)){
                count++;
                System.out.println(number);
            }
        }
    }

    static boolean isPrime(BigInteger number) {
        for (BigInteger d = new BigInteger("2");
             d.compareTo(number.divide(new BigInteger("2"))) <= 0;
             d = d.add(new BigInteger("1"))) {
             if (number.remainder(d).compareTo(new BigInteger("0")) == 0) {
                 return false;
            }
        }
        return true;
    }
}
