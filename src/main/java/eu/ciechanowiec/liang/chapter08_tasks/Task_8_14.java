package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        int[][] m = new int[size][size];

        generateMatrix(m);
        displayMatrix(m);

        int column = 0;
        int row = 0;

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < m.length; i++) {
                if (isRowSequence(m,k,i)) {
                    System.out.printf("All %ds on row %d%n", k, i);
                    row++;
                }
            }
        }

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < m.length; i++) {
                if (isColumnSequence(m,k,i)) {
                    System.out.printf("All %ds on column %d%n", k, i);
                    column++;
                }
            }
        }
        if (column == 0) {
            System.out.println("No same numbers on a column");
        }
        if (row == 0) {
            System.out.println("No same numbers on a row");
        }

        String majorDiagonal = (isMajorDiagonal(m, 1))? "One's on the diagonal" :
                (isMajorDiagonal(m, 0))? "Zero's on the diagonal" : "No same numbers on a diagonal";
        String sunDiagonal = (isSubDiagonal(m, 1))? "One's on the sub diagonal" :
                (isSubDiagonal(m, 0))? "Zero's on the sub diagonal" : "No same numbers on a sub diagonal";

        System.out.println(majorDiagonal);
        System.out.println(sunDiagonal);
    }

    private static boolean isRowSequence(int[][] matrix, int number, int row) {
        for (int k = 0; k < matrix[row].length; k++) {
            if (matrix[row][k] != number) {
                return false;
            }
        }
        return true;
    }

    private static boolean isColumnSequence(int[][] matrix, int number, int column) {
        for (int[] ints : matrix) {
            if (ints[column] != number) {
                return false;
            }
        }
        return true;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println();

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
    private static void generateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = (int)(Math.random() * 2);
            }
        }
    }

    private static boolean isMajorDiagonal(int[][] matrix, int number) {
        boolean bottomLeftDown = true;
        boolean topLeftDown = true;
        int k = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != number) {
                topLeftDown = false;
                break;
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            if (matrix[i][k++] != number) {
                bottomLeftDown = false;
            }
        }

        return topLeftDown || bottomLeftDown;
    }

    private static boolean isSubDiagonal(int[][] matrix, int number) {
        for (int i = 1; i < matrix.length; i++) {
            if (number != matrix[i][i - 1]) {
                return false;
            }
        }
        return true;
    }
}
