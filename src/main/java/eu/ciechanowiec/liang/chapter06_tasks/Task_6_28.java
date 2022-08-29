package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_28 {

    public static void main(String[] args) {
        System.out.println("p\t\t2^p-1");
        System.out.println("-------------------");

        for(int p = 1; p <= 31; p++) {
            if (isPrime(p)) {
                System.out.printf("%-7d %d%n", p, mersennePrime(p));
            }
        }
    }

    static int mersennePrime(int p) {
        return (int) (Math.pow(2, p) - 1);
    }

    static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
