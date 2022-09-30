package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_23 {

    public static void main(String[] args) {
        int numberOfOnesRow = 0;
        int numberOfOnesColumn = 0;
        int indexOfFlippedRow = -1;
        int indexOfFlippedColumn = -1;

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];

        System.out.println("Enter a 6−by−6 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numberOfOnesRow++;
                }

                if (numberOfOnesRow % 2 != 0 && j == 5) {
                    indexOfFlippedRow = i;
                }
            }
            numberOfOnesRow = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    numberOfOnesColumn++;
                }

                if (numberOfOnesColumn % 2 != 0 && j == 5) {
                    indexOfFlippedColumn = i;
                }
            }
            numberOfOnesColumn = 0;
        }

        System.out.printf("The flipped cell is at (%d, %d)%n", indexOfFlippedRow, indexOfFlippedColumn);
    }
}
