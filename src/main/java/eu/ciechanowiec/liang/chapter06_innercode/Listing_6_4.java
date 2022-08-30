package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_4 {

    public static void main(String[] args) {
        int x = 1;

        System.out.printf("Before the call, x is %d%n", x);

        increment(x);

        System.out.printf("After the call, x is %d%n", x);
    }

    private static void increment(int n) {
        n++;
        System.out.printf("n inside the method is %d%n", n);
    }
}
