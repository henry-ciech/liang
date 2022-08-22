package eu.ciechanowiec.liang.chapter05_innercode;

class Listing_5_10 {

    public static void main(String[] args) {
        double tuition = 10_000;
        int year = 0;

        while (tuition < 20_000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.printf("Tuition will be doubled in %d years%n", year);
        System.out.printf("Tuition will be $%4.2f in %d years%n", tuition, year);
    }
}
