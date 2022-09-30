package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        System.out.println("""
                Enter the filing status:
                0 - single filer
                1 - married jointly or qualifying widow(er)
                2 - married separately
                3 - head of household
                """);
        int status = getStatus();

        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();

        System.out.printf("Tax is $%6.2f%n",
                computeTax(brackets, rates, status, income));
    }

    private static double computeTax(int[][] brackets, double[] rates, int status, double income) {
        double incomeTaxed = 0;

        for (int i = 4; i >= 0; i--) {
            if (income > brackets[status][i]) {
                incomeTaxed = income - brackets[status][i] * rates[i + 1];
            }
            income -= incomeTaxed;
        }
        return brackets[status][0] * rates[0];
    }

    private static int getStatus(){
        Scanner scanner = new Scanner(System.in);
        int status;
        do {
            status = scanner.nextInt();
            if (status < 0 || status > 3) {
                System.out.println("Error: invalid status");
            }
        } while (status < 0 || status > 3);

        return status;
    }
}
