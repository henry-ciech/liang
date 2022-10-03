package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

/*
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 8 2 9
6 5 6 1 1 9 1
1 3 6 1 4 0 7
3 3 3 3 4 0 7 for row

0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 5 2 1 8 2 9
6 5 6 1 1 9 1
1 5 6 1 4 0 7
3 5 3 3 4 0 7 for column

0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 6 2 9
6 5 6 6 1 9 1
1 3 6 1 4 0 7
3 6 3 3 4 0 7 for right diagonal

0 1 0 3 1 6 1
0 1 6 8 6 0 1
9 6 2 1 8 2 9
6 9 6 1 1 9 1
1 3 9 1 4 0 7
3 3 3 9 4 0 7 for left diagonal*/

class Task_8_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[6][7];
        System.out.println("Enter matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        if(isConsecutiveFour(matrix)) {
            System.out.println("There are four consecutive equal numbers");
        }
    }

    private static boolean isConsecutiveFour(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j + 3 < matrix[i].length) {
                    if (matrix[i][j] == matrix[i][j + 1] && matrix[i][j + 2] == matrix[i][j + 3]) {
                        return true;
                    }
                }

                if (i - 3 >= 0) {
                    if (matrix[i][j] == matrix[i - 1][j] && matrix[i - 2][j] == matrix[i - 3][j]) {
                        return true;
                    }
                }

                if (i - 3 >= 0 && j + 3 < matrix[i].length) {
                    if (matrix[i][j] == matrix[i - 1][j + 1] && matrix[i - 2][j + 2] == matrix[i - 3][j + 3]) {
                        return true;
                    }
                }

                if (i - 3 >= 0 && j - 3 >= 0) {
                    if (matrix[i][j] == matrix[i - 1][j - 1] && matrix[i - 2][j - 2] == matrix[i - 3][j - 3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
