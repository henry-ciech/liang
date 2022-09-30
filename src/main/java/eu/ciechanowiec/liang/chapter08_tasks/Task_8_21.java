package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int numberOfCities = scanner.nextInt();
        double[][] matrix = new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        distance(matrix, numberOfCities);
    }

    private static void distance(double[][] cities, int number) {
        double shortestDistance = Integer.MAX_VALUE;
        int shortestDistanceIndex = -1;
        double[] distances = new double[number];
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                distances[i] += Math.sqrt((cities[j][1] - cities[i][1]) * (cities[j][1] - cities[i][1]) +
                        (cities[j][0] - cities[i][0]) * (cities[j][0] - cities[i][0]));
            }
        }

        for (int i = 0; i < cities.length; i++) {
            if (distances[i] < shortestDistance) {
                shortestDistance = distances[i];
                shortestDistanceIndex = i;
            }
        }
        System.out.printf("""
                The central city is at (%f, %f)
                The total distance to all other cities is %f
                """, cities[shortestDistanceIndex][0], cities[shortestDistanceIndex][1], shortestDistance);
    }
}
