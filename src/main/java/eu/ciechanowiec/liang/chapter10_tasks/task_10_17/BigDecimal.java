package eu.ciechanowiec.liang.chapter10_tasks.task_10_17;

class BigDecimal {

    public static void main(String[] args) {
        java.math.BigDecimal longMaxValue = new java.math.BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        java.math.BigDecimal decimal = new java.math.BigDecimal(start);
        int count = 0;

        while (count < 10) {
            java.math.BigDecimal squared = decimal.multiply(decimal);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;
                System.out.println(count+": " + decimal + " squared = " + squared);
            }
            decimal = decimal.add(java.math.BigDecimal.ONE);
        }
    }
}
