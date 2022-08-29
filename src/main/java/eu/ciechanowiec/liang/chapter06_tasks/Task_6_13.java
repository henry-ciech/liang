package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_13 {

    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-7d %-7.4f%n", i, countM(i));
        }
    }

    static double countM(int n) {
        double m = 0;

        for (double i = 1; i <= n; i++) {
            m += i / (i + 1);
        }

        return m;
    }
}
