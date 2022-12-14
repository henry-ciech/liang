package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_28 {

    public static void main(String[] args) {
        System.out.println("p\t\t2^p-1");
        System.out.println("-------------------");

        for (int p = 1; p <= 31; p++) {
            if (isPrime(p)) {
                System.out.printf("%-7d %d%n", p, mersennePrime(p));
            }
        }
    }

    private static int mersennePrime(int number) {
        return (int) (Math.pow(2, number) - 1);
    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
