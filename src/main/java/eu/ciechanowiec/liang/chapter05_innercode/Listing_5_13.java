package eu.ciechanowiec.liang.chapter05_innercode;

class Listing_5_13 {

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;

            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }

        System.out.printf("The number is %d%n", sum);
    }
}
