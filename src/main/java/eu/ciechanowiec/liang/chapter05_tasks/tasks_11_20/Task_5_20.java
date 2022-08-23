package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

class Task_5_20 {


    private static final int NUMBERS_PER_LINE = 8;

    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for(int divisor = 2; i / 2 >= divisor; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.printf("%n%4d ", i);
                } else {
                    System.out.printf("%4d ", i);
                }
                count++;
             }
        }
    }
}
