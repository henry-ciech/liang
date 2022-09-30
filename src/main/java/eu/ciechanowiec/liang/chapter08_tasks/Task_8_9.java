package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = new String[3][3];
        int count = 1;

        while (isWon("X", matrix) && isWon("O", matrix)) {
            print(matrix);
            if (count % 2 == 0) {
                ask(matrix, "O");
            } else {
                ask(matrix, "X");
            }
            count++;
        }
        print(matrix);
        if (count % 2 == 0 && !isWon("X", matrix)) {
            System.out.println("\nX player won");
        } else if (count % 2 != 0 && !isWon("O", matrix)) {
            System.out.println("\nO player won");
        } else {
            System.out.println("Draw");
        }
    }

    private static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("--------------");
            System.out.println();
            System.out.print("|");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    System.out.print("   |");
                } else {
                    System.out.printf(" %s |", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void ask(String[][] matrix, String player) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a row (0, 1, or 2) for player %s:%n", player);
        int row = scanner.nextInt();
        System.out.printf("Enter a column (0, 1, or 2) for player %s:%n", player);
        int column = scanner.nextInt();
        if (player.equalsIgnoreCase("X")) {
            matrix[row][column] = "X";
        } else {
            matrix[row][column] = "O";
        }
    }

    private static boolean isWon(String player, String[][] board) {
        for (int i = 0; i < 3; i++) {
            if (player.equalsIgnoreCase(board[i][0]) && player.equalsIgnoreCase(board[i][1])
                    && player.equalsIgnoreCase(board[i][2])) {
                return false;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (player.equalsIgnoreCase(board[0][j]) && player.equalsIgnoreCase(board[1][j])
                    && player.equalsIgnoreCase(board[2][j])) {
                return false;
            }
        }

        if (player.equalsIgnoreCase(board[0][0]) && player.equalsIgnoreCase(board[1][1])
                && player.equalsIgnoreCase(board[2][2])) {
            return false;
        }

        return !player.equalsIgnoreCase(board[0][2]) || !player.equalsIgnoreCase(board[1][1])
                || !player.equalsIgnoreCase(board[2][0]);
    }
}
