package eu.ciechanowiec.liang.chapter05_innercode;

class Listing_5_8 {

    public static void main(String[] args) {

        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum  += i;
        }

        System.out.printf("The sum is %f", sum);
    }
}
