package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_38 {

    private static final int SYMBOLS_PER_LINE = 50;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % SYMBOLS_PER_LINE == 0) {
                System.out.printf("%c%n", getRandomUpperCaseLetter());
            } else {
                System.out.printf("%c ", getRandomUpperCaseLetter());
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (i % SYMBOLS_PER_LINE == 0) {
                System.out.printf("%c%n", getRandomDigitCharacter());
            } else {
                System.out.printf("%c ", getRandomDigitCharacter());
            }
        }
    }

    private static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    private static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    private static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}
