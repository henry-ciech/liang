package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_10 {

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    private static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    private static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    private static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
