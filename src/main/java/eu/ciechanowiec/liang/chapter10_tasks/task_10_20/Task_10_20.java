package eu.ciechanowiec.liang.chapter10_tasks.task_10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task_10_20 {

    public static void main(String[] args) {
        System.out.println("The e values for i = 100 to 1000:");
        System.out.println("-----------------------------------");
        System.out.println("i\t\te");
        System.out.println("-----------------------------------");
        for (BigDecimal i = BigDecimal.valueOf(100);
             i.compareTo(BigDecimal.valueOf(1000)) <= 0;
             i = i.add(BigDecimal.valueOf(100))) {
            System.out.println(i + "    " + getE(i));
        }
    }

    private static BigDecimal getE(BigDecimal number) {
        BigDecimal one = BigDecimal.valueOf(1);
        BigDecimal eNumber =  BigDecimal.valueOf(0.0);
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
