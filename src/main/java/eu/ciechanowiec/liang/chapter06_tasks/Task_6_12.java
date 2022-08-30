package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_12 {

    public static void main(String[] args) {
        printChar('a', 'z', 10);
        System.out.println();
    }

    private  static void printChar(char ch1, char ch2, int numberPerLine) {
        char ch3;
        int count = 0;

        for (int i = ch1; i <= ch2; i++) {
            count++;
            ch3 = (char) i;

            if (count % numberPerLine  == 0) {
                System.out.printf("%c%n", ch3);
            } else {
                System.out.printf("%c ", ch3);
            }
        }
    }
}
