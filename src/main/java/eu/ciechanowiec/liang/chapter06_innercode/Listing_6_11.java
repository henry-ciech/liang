package eu.ciechanowiec.liang.chapter06_innercode;

import java.util.Random;

class Listing_6_11 {

    private static final int NUMBER_OF_CHARS = 175;
    private static final int CHARS_PER_LINE = 25;

    public static void main(String[] args) {
        for (int i = 0; i <= NUMBER_OF_CHARS; i++) {
            char ch = Listing_6_10.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
