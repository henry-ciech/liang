package eu.ciechanowiec.liang.chapter07_innercode;

class Listing_7_4 {

    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("The lowercase letters are:");
        displayArray(chars);
        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);

        System.out.println();
    }

    public static char[] createArray() {

        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (char aChar : chars) {
            counts[aChar - 'a']++;
        }

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }

    private static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    private static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
}
