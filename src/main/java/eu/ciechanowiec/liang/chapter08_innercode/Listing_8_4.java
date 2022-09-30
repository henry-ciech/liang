package eu.ciechanowiec.liang.chapter08_innercode;

import java.util.Scanner;

class Listing_8_4 {

    public static void main(String[] args) {
        int[][] grid = readSolution();
        System.out.printf("%s solution%n", isValid(grid) ? "Valid" : "Invalid");
    }

    private static int[][] readSolution() {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[9][9];

        System.out.println("Enter a Sudoku puzzle solution:");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        return grid;
    }

    private static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9
                        || !isValid(i, j, grid)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int i, int j, int[][] grid) {
        for (int column = 0; column < 9; column++) {
            if (column != j && grid[i][column] == grid[i][j]) {
                return false;
            }
        }

        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j]) {
                return false;
            }
        }

        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                if (!(row == i && col == j) && grid[row][col] == grid[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
