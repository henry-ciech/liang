package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_1 {

    public static void main(String[] args) {

        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.printf("The maximum of %d and %d is %d", i, j, k);
    }

    static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
