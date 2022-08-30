package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_9 {

    public static void main(String[] args) {
        System.out.printf("The maximum of 3 and 4 is %d%n", max(3, 4));

        System.out.printf("The maximum of 3.0 and 5.4 is %.1f%n", max(3.0, 5.4));

        System.out.printf("The maximum of 3.0, 5.4 and 10.14 is %.2f%n", max(3.0, 5.4, 10.14));
    }

    private static int max(int num1, int num2) {
        return (num1 > num2)? num1 : num2;
    }

    private static double max(double num1, double num2) {
        return (num1 > num2)? num1 : num2;
    }

    private static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
