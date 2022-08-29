package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_29 {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d)%n", i, i + 2);
            }
        }
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
