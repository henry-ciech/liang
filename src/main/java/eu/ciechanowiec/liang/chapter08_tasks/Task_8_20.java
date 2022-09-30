package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Arrays;
import java.util.Scanner;

class Task_8_20 {

    public static void main(String[] args) {
        String[][] matrix = new String[6][7];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], "O");
        }
        ask(matrix);
        print(matrix);
    }

    private static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            System.out.print("|");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equalsIgnoreCase("O")) {
                    System.out.print(" |");
                } else {
                    System.out.printf("%s|", matrix[i][j]);
                }
            }
            System.out.println();
        }
        System.out.print("------------------");
    }

    private static boolean isWin(String[][] matrix, String redOrYellow) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j + 3 < matrix.length) {
                    if (matrix[i][j].equalsIgnoreCase(redOrYellow) && matrix[i][j + 1].equalsIgnoreCase(redOrYellow)
                            && matrix[i][j + 2].equalsIgnoreCase(redOrYellow)
                            && matrix[i][j + 3].equalsIgnoreCase(redOrYellow)) {
                        return false;
                    }
                }

                if (i - 3 >= 0) {
                    if (matrix[i][j].equalsIgnoreCase(redOrYellow) && matrix[i - 1][j].equalsIgnoreCase(redOrYellow)
                            && matrix[i - 2][j].equalsIgnoreCase(redOrYellow)
                            && matrix[i - 3][j].equalsIgnoreCase(redOrYellow)) {
                        return false;
                    }
                }

                if (i - 3 >= 0 && j + 3 < matrix[i].length) {
                    if (matrix[i][j].equalsIgnoreCase(redOrYellow) && matrix[i - 1][j + 1].equalsIgnoreCase(redOrYellow)
                            && matrix[i - 2][j + 2].equalsIgnoreCase(redOrYellow)
                            && matrix[i - 3][j + 3].equalsIgnoreCase(redOrYellow)) {
                        return false;
                    }
                }

                if (i - 3 >= 0 && j - 3 >= 0) {
                    if (matrix[i][j].equalsIgnoreCase(redOrYellow) && matrix[i - 1][j - 1].equalsIgnoreCase(redOrYellow)
                            && matrix[i - 2][j - 2].equalsIgnoreCase(redOrYellow)
                            && matrix[i - 3][j - 3].equalsIgnoreCase(redOrYellow)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void ask(String[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int column;
        int[] numberOfColors = new int[7];
        Arrays.fill(numberOfColors, 5);

        while (isWin(matrix, "R") && isWin(matrix, "Y")){
            print(matrix);
            System.out.printf("%nDrop a %s disk at column (0–6):%n", (count % 2 == 0)? "yellow" : "red");
            column = scanner.nextInt();
            if (numberOfColors[column] < 0) {
                System.out.println("line is full");
            } else {
                if (count % 2 == 0) {
                    matrix[numberOfColors[column]][column] = "Y";
                } else {
                    matrix[numberOfColors[column]][column] = "R";
                }
                numberOfColors[column]--;
                count++;
            }
        }
        System.out.printf("%s wins%n", (count % 2 == 0)? "Red" : "Yellow");
    }
}
