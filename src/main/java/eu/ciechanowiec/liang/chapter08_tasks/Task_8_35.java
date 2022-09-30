package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] location = findLargestBlock(matrix);

        if (location != null) {
            System.out.printf("The maximum square submatrix is at (%d, %d) with size %d",
                    location[0], location[1], location[2]);
        }

    }

    private static int[] findLargestBlock(int[][] matrix) {
        int[] highestSquare = null;
        int highestSize = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int occurrence = getOccurrence(matrix, i, j);
                if (occurrence < 2) {
                    continue;
                }
                if (scanPossibleSquare(matrix, i, j, occurrence) && occurrence > highestSize) {
                    highestSize = occurrence;
                    highestSquare = new int[]{i,j,occurrence};
                }
            }
        }
        return highestSquare;
    }

    private static int getOccurrence(int[][] matrix, int row, int column) {
        int occurrence = 0;
        if (column == matrix[0].length - 1) {
            return 0;
        }
        for (int j = column; j < matrix[0].length; j++) {
            if (matrix[row][j] == 1) {
                occurrence++;
                if (j == matrix[0].length - 1) {
                    return occurrence;
                }
            } else if (occurrence > 1) {
                return occurrence;
            } else {
                return 0;
            }
        }
        return 0;
    }

    private static boolean scanPossibleSquare(int[][] m, int row, int column, int occurrence) {
        if (row + occurrence > m.length) return false;
        for (int i = row; i < occurrence + row; i++) {
            for (int j = column; j < occurrence + column; j++) {
                if (m[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
