package eu.ciechanowiec.liang.chapter10_tasks.task_10_3;

class MyInteger {

    private final int value;

    MyInteger(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    boolean isOdd() {
        return value % 2 != 0;
    }

    boolean isPrime() {
        boolean flag = false;

        for (int i = 2; i <= value / 2; ++i) {
            if (value % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    boolean isPrime(int number) {
        boolean isntPrime = false;

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isntPrime = true;
                break;
            }
        }
        return !isntPrime;
    }

    boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }
}
