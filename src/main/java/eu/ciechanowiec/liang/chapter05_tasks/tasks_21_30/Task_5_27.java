package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

class Task_5_27 {

    private static final int NUMBERS_PER_LINE = 10;

    public static void main(String[] args) {
        boolean isLeapYear;
        int count = 0;

        for (int i = 101; i <= 2100; i++) {
            isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);

            if (isLeapYear) {
                count++;
                System.out.printf("%4d: %4d ", count, i);

                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.printf("%n");
                }
            }
        }
    }
}
