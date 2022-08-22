package eu.ciechanowiec.liang.chapter05_innercode;

class Listing_5_7 {

    public static void main(String[] args) {

        System.out.println("Multiplication Table");

        for (int j = 1; j <= 9; j++) {
            System.out.printf("   %d", j);
        }

        System.out.println("\n----------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d |", i);

            for (int j = 1; j <=9; j++) {
                System.out.printf("%4d", j * i);
            }

            System.out.println();
        }
    }
}
