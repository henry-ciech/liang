package eu.ciechanowiec.liang.chapter09_tasks.task_9_11;

import java.util.Scanner;

class TestAlgebra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a b c d e f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        Algebra algebra = new Algebra(a, b, c, d, e, f);

        if (algebra.isSolvable()) {
            System.out.printf("""
                    X: %.1f
                    Y: %.1f
                    """, algebra.getX(), algebra.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
