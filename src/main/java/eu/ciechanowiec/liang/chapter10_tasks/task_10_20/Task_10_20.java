package eu.ciechanowiec.liang.chapter10_tasks.task_10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task_10_20 {

    public static void main(String[] args) {
        System.out.println("\nThe e values for i = 100 to 1000:");
        System.out.println("-----------------------------------");
        System.out.println("i\t\te");
        System.out.println("-----------------------------------");
        for (BigDecimal i = new BigDecimal("100");
             i.compareTo(new BigDecimal("1000")) <= 0;
             i = i.add(new BigDecimal("100"))) {
            System.out.println(i + "    " + getE(i));
        }
    }

    private static BigDecimal getE(BigDecimal number) {
        BigDecimal one = new BigDecimal("1");
        BigDecimal eNumber = new BigDecimal("0.0");
        for (BigDecimal i = one; i.compareTo(number) <= 0; i = i.add(one)) {
            BigDecimal denominator = i;
            for (BigDecimal k = i.subtract(one);
                 k.compareTo(one) >= 1;
                 k = k.subtract(one)) {
                denominator = denominator.multiply(k);
            }
            eNumber = one.divide(denominator, 25, RoundingMode.UP).add(eNumber);

        }
        return eNumber;
    }
}
