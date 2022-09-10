package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];

        System.out.println("Enter a b c:");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = scanner.nextDouble();
        }

        System.out.printf("""
                Number of roots: %d
                Roots: %f %f
                """, solveQuadratic(eqn, roots), roots[0], roots[1]);
    }

    private static int solveQuadratic (double[] eqn, double[] roots) {
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        int count = 0;

        if (discriminant > 0) {
            roots[0] = count(discriminant, eqn[0], eqn[1]);
            roots[1] = (int) ((-eqn[1] - Math.pow(discriminant, 0.5)) / (2 * eqn[0]) * 1000) / 1000.0;
            count = 2;
        } else if (discriminant == 0) {
            roots[0] = count(discriminant, eqn[0], eqn[1]);
            count = 1;
        }
        return count;
    }

    private static double count(double discriminant, double a, double b) {
        return ((-b + Math.pow(discriminant, 0.5)) / (2 * a) * 1000) / 1000.0;
    }
}
