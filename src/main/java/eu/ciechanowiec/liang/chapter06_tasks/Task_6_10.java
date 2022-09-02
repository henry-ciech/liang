package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
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
