package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        String output = (isValid(grid))? "Valid solution" : "Invalid solution";
        System.out.println(output);

    }

    private static boolean isValid(int[][] matrix) {
        return checkColumns(matrix) && checkRows(matrix) && checkEverySmallBox(matrix);
    }

    private static boolean checkColumns(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            boolean[] columnCheck = new boolean[9];
            for (int i = 0; i < matrix.length; i++) {
                int index = matrix[i][j] - 1;
                if (index > 8) {
                    return false;
                }
                if (!columnCheck[index]) {
                    columnCheck[index] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean[] checkRow = new boolean[9];
            for (int j = 0; j < matrix[i].length; j++) {
                int index = matrix[i][j] - 1;
                if (index > 8) {
                    return false;
                }
                if (!checkRow[index]) {
                    checkRow[index] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkEverySmallBox(int[][] matrix) {
        int boxRow = 0;
        while (boxRow < 81) {
            for (int i = boxRow / 3; i < (boxRow / 3) + 3; i++) {
                boolean[] checkBox = new boolean[9];
                for (int j = boxRow / 3; j < (boxRow / 3); j++) {
                    int index = matrix[i][j] - 1;
                    if (index > 8) {
                        return false;
                    }
                    if (!checkBox[index]) {
                        checkBox[index] = true;
                    } else {
                        return false;
                    }
                }
            }
            boxRow += 3;
        }
        return true;
    }
}
/*
9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3
*/
