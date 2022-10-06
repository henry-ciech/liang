package eu.ciechanowiec.liang.chapter09_tasks.task_9_10;

import java.util.Scanner;

class TestAlgebra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a b c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Algebra algebra = new Algebra(a, b, c);

        if (algebra.getDiscriminant() > 0) {
            System.out.printf("""
                    Root1: %.1f
                    Root2: %.2f
                    """, algebra.getRoot1(), algebra.getRoot2());
        } else if (algebra.getDiscriminant() == 0) {
            System.out.printf("Root1: %.1f%n", algebra.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
