package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_7 {

    static private final int NUMBER_OF_PRIMES_PER_LINE = 10;

    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are\n");

        printPrimeNumbers(50);

    }

    private static void printPrimeNumbers(int numberOfPrime) {
        int count = 0;
        int number = 2;

        while (count < numberOfPrime) {
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d%n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }

            number++;
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
