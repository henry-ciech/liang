package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_27 {

    private static final int NUMBERS_PER_LINE = 10;

    public static void main(String[] args) {
        for (int i = 1, j = 1; j <= 100; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                if (j % NUMBERS_PER_LINE == 0) {
                    System.out.printf("%7d%n", i);
                } else {
                    System.out.printf("%7d ", i);
                }

                j++;
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

    private static boolean isPalindrome(int number) {
        StringBuilder input = new StringBuilder();

        input.append(number);
        input.reverse();

        int reverseNumber = Integer.parseInt(String.valueOf(input));

        return isPrime(number) && isPrime(reverseNumber);
    }
}
