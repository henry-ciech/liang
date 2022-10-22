package eu.ciechanowiec.liang.chapter10_tasks.task_10_21;

import java.math.BigInteger;

class Task_10_21 {

    public static void main(String[] args) {

        int count = 0;
        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");
        while (count < 10) {
            number = number.add(new BigInteger("1"));
            if ((number.remainder(five)).compareTo(zero) == 0 ||
                    (number.remainder(six)).compareTo(zero) == 0) {
                System.out.println(number);
                count++;
            }
        }
    }
}
