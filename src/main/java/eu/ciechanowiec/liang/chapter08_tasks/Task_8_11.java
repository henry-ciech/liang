package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int bIndex = 0;

        System.out.println("Enter a number between 0 and 511: ");
        int number = scanner.nextInt();
        String binary = decimalToBinary(number);

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                int coinSide = (binary.charAt(bIndex++) == '0') ? 0 : 1;
                matrix[i][k] = coinSide;
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                char ch = (anInt == 0) ? 'H' : 'T';
                System.out.print(ch + " ");
            }
            System.out.println("");
        }

    }

    private static String decimalToBinary(int number) {
        StringBuilder input = new StringBuilder();

        while (number != 0) {
            input.append(number & 1);
            number = number >> 1;
        }
        while (input.length() < 9) {
            input.insert(0, "0");
        }
        return input.toString();
    }
}
