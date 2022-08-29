package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_5 {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.printf("Before invoking the swap method, num1 is %d and num2 is %d%n", num1, num2);

        swap(num1, num2);

        System.out.printf("Before invoking the swap method, num1 is %d and num2 is %d%n", num1, num2);
    }

    static void swap(int n1, int n2) {
        System.out.println("\n\tInside the swap method");
        System.out.printf("Before swapping, n1 is %d and n is %d%n", n1, n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.printf("Before swapping, n1 is %d and n is %d%n%n11", n1, n2);
    }
}
