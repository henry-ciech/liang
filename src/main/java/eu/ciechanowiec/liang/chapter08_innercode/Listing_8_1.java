package eu.ciechanowiec.liang.chapter08_innercode;

import java.util.Scanner;

class Listing_8_1 {

    public static void main(String[] args) {
        int[][] m = getArray();

        System.out.printf("%nSum of all elements: %d%n", sum(m));
    }

    private static int[][] getArray() {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.printf("Enter %d rows ad %d columns:%n", m.length, m[0].length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        return m;
    }

    private static int sum(int[][] m) {
        int total = 0;
        for (int[] ints : m) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }
}
