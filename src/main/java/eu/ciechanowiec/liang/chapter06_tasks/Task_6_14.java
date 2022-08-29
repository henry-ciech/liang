package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_14 {

    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");

        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-7d %-7.4f%n", i, calculatePi(i));
        }
    }

    static double calculatePi(int n) {
        double pi = 0;

        for (int i = 1; i <= n; i++) {
            pi += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
        }

        return pi;
    }
}
