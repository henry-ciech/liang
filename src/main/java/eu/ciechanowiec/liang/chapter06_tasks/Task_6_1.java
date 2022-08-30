package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_1 {

    private static final int NUMBERS_PER_LINE = 10;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % NUMBERS_PER_LINE == 0) {
                System.out.printf("%7d%n", getPentagonalNumber(i));
            } else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
        }
    }

    private static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
