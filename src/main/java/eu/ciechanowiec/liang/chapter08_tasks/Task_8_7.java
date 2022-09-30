package eu.ciechanowiec.liang.chapter08_tasks;

class Task_8_7 {

    public static void main(String[] args) {
        double distance;
        double shortestDistance = Integer.MAX_VALUE;
        int point1 = -2;
        int point2 = -2;

        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                distance = computeDistance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }

        System.out.println("The closest two points are:");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%.1f ", points[point1][i]);
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%.1f ", points[point2][i]);
        }

        System.out.println();
    }

    private static double computeDistance(double x1, double y1, double z1, double x2, double y2, double z2) {

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
    }
}
