package eu.ciechanowiec.liang.chapter07_tasks;

class Task_7_36 {

    public static void main(String[] args) {
        int number = 8;
        nQueens(number);
    }

    private static void nQueens(int numberOfQueens) {
        int[] board = new int[numberOfQueens];
        placeQueen(board, 0, numberOfQueens);
        displayQueens(board);
    }

    private static void placeQueen(int[] board, int current, int noOfQueens) {
        for (int i = 0; i < noOfQueens; i++) {
            board[current] = i;
            if (noKill(board, current)) {
                placeQueen(board, current + 1, noOfQueens);
                break;
            }
        }
    }

    private static boolean noKill(int[] board, int currentColumnOfQueen) {
        for (int i = 0; i < currentColumnOfQueen; i++) {
            if (board[i] == board[currentColumnOfQueen]) {
                return false;
            }

            if ((currentColumnOfQueen - i) == Math.abs(board[currentColumnOfQueen] - board[i])) {
                return false;
            }
        }
        return true;
    }

    private static void displayQueens(int[] board) {
        System.out.print("\n");

        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int value : board) {
                if (value == i) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("|\t");
                }
            }
            System.out.print("\n");
        }
    }
}

