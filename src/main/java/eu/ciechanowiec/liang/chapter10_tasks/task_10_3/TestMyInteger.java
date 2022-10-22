package eu.ciechanowiec.liang.chapter10_tasks.task_10_3;

class TestMyInteger {

    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(8);
        MyInteger myInteger2 = new MyInteger(13);
        MyInteger myInteger3 = new MyInteger(9);

        System.out.printf("""
                myInteger1 odd, even, prime: %b, %b, %b
                myInteger2 odd, even, prime: %b, %b, %b
                myInteger3 odd, even, prime: %b, %b, %b
                """,
                myInteger1.isOdd(), myInteger1.isEven(), myInteger1.isPrime(),
                myInteger2.isOdd(3), myInteger2.isEven(3), myInteger2.isPrime(3),
                myInteger3.isOdd(myInteger2), myInteger3.isEven(myInteger2), myInteger3.isPrime(myInteger2));
    }
}
