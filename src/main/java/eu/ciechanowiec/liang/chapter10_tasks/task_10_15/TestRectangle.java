package eu.ciechanowiec.liang.chapter10_tasks.task_10_15;

import java.util.Scanner;

class TestRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.println("Enter 5 points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        Rectangle rectangle = Rectangle.getRectangle(points);
        System.out.printf("""
                Center: (%.1f, %.1f)
                Width: %.1f
                Height: %.1f
                """, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }
}
