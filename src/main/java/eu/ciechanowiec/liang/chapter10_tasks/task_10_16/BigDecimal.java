package eu.ciechanowiec.liang.chapter10_tasks.task_10_16;

class BigDecimal {

    public static void main(String[] args) {
        int hugeNumCount = 0;
        java.math.BigDecimal hugeNum = new java.math.BigDecimal("" + 1 + "0".repeat(49));

        while (hugeNumCount < 10) {
            java.math.BigDecimal remainder2 = hugeNum.remainder(new java.math.BigDecimal(2));
            java.math.BigDecimal remainder3 = hugeNum.remainder(new java.math.BigDecimal(3));

            if (remainder2.equals(java.math.BigDecimal.ZERO) || remainder3.equals(java.math.BigDecimal.ZERO)) {
                hugeNumCount++;
                System.out.println(hugeNumCount +": " + hugeNum);
            }
            hugeNum = hugeNum.add(java.math.BigDecimal.ONE);
        }
    }
}
