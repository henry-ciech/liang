package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_17 {

    private static final int ID = 0;
    private static final int LOAN = 1;
    private static double[][][] mBanks;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of banks: ");
        int numberOfBanks = scanner.nextInt();
        System.out.println("Enter minimum limit: ");
        int limit = scanner.nextInt();

        mBanks = new double[numberOfBanks][][];

        System.out.println("Example:");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%n",
                "bank # |", "balance |", "Loaned# |", "Bank ID |", "Amounts |", "Bank ID |", "Amounts |");
        System.out.printf("%-7d|%8.2f|%8d|", 1, 200.0, 2);
        System.out.printf("%8.0f|%8.2f|", 2.0, 73.0);
        System.out.printf("%8.0f|%8.2f|%n%n", 1.0, 130.0);

        for (int i = 0; i < mBanks.length; i++) {
            System.out.print("Enter bank #"+i+" > ");
            double balance = scanner.nextDouble();
            int numBanks = scanner.nextInt();
            mBanks[i] = new double[++numBanks][2];
            mBanks[i][0][0] = balance;

            for (int bank = 1; bank < mBanks[i].length; bank++) {
                mBanks[i][bank][ID] = scanner.nextDouble();
                mBanks[i][bank][LOAN] = scanner.nextDouble();
            }
        }

        System.out.println();
        displayMatrix(mBanks);
        boolean[] unsafeIndex = scanBanks(mBanks, limit);

        for (int i = 0; i < unsafeIndex.length; i++) {
            System.out.println("Bank# " + i + " unsafe: " +unsafeIndex[i] );
        }

    }

    private static boolean[] scanBanks(double[][][] matrix, int limit) {
        boolean[] indexUnsafeBanks = new boolean[matrix.length];
        double total;
        boolean isSafe = false;
        while (!isSafe) {
            isSafe = true;
            for (int banks = 0; banks < matrix.length; banks++) {
                total = matrix[banks][0][0];
                for (int loanedBanks = 1; loanedBanks < matrix[banks].length; loanedBanks++) {
                    int index = (int)matrix[banks][loanedBanks][ID];
                    if (!indexUnsafeBanks[index]) {
                        total += matrix[banks][loanedBanks][LOAN];
                    }
                }
                if (total < limit && !indexUnsafeBanks[banks]) {
                    indexUnsafeBanks[banks] = true;
                    isSafe = false;
                }
            }
        }
        return indexUnsafeBanks;
    }


    private static void displayMatrix(double[][][] matrix) {
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%n",
                "bank # |", "balance |", "Loaned# |", "Bank ID |", "Amounts |", "Bank ID |", "Amounts |");
        for (int banks = 0; banks < matrix.length; banks++) {
            System.out.printf("%-7d|%8.2f|%8d|", banks, matrix[banks][0][0], matrix[banks].length -1);
            for (int LoanedBanks = 1; LoanedBanks < matrix[banks].length; LoanedBanks++) {
                System.out.printf("%8.0f|%8.2f|", matrix[banks][LoanedBanks][ID], matrix[banks][LoanedBanks][LOAN]);
            }
            System.out.println();
        }
    }
}
