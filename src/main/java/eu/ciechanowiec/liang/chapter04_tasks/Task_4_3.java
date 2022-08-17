package eu.ciechanowiec.liang.chapter04_tasks;

class Task_4_3 {

    private static final double RADIUS = 6_371.01;

    public static void main(String[] args) {
        double charlotteGpsX = 35.2270869;
        double charlotteGpsY = -80.8431267;
        double savannahGpsX = 32.0835407;
        double savannahGpsY = -810998342;
        double orlandoGpsX = 28.5383355;
        double orlandoGpsY = -81.3792365;
        double atlantaGpsX = 33.7489954;
        double atlantaGpsY = -84.3879824;

        double side1 = calculateDistance(charlotteGpsX, charlotteGpsY, savannahGpsX, savannahGpsY);
        double side2 = calculateDistance(savannahGpsX, savannahGpsY, orlandoGpsX, orlandoGpsY);
        double side3 = calculateDistance(orlandoGpsX, orlandoGpsY, atlantaGpsX, atlantaGpsY);
        double side4 = calculateDistance(atlantaGpsX, atlantaGpsY, charlotteGpsX, charlotteGpsY);
        double middleSide = calculateDistance(orlandoGpsX, orlandoGpsY, charlotteGpsX, charlotteGpsY);

        double halfPerimeterTriangle1 = (side1 + side2 + middleSide) / 2;
        double areaTriangle1 = Math.pow(halfPerimeterTriangle1 * (halfPerimeterTriangle1 - side1)
                * (halfPerimeterTriangle1 - side2) * (halfPerimeterTriangle1 - middleSide), 0.5);

        double halfPerimeterTriangle2 = (side3 + side4 + middleSide) / 2;
        double areaTriangle2 = Math.pow(halfPerimeterTriangle2 * (halfPerimeterTriangle2 - side1)
                * (halfPerimeterTriangle2 - side2) * (halfPerimeterTriangle2 - middleSide), 0.5);


        System.out.printf("Perimeter: %4.2f%n", areaTriangle1 + areaTriangle2);
    }

    private static double calculateDistance( double x1, double y1, double x2, double y2) {
        return RADIUS * Math.acos(Math.sin(Math.toRadians(-x1))) * Math.sin(Math.toRadians(-x2))
                + Math.cos(Math.toRadians(-x1)) * Math.cos(Math.toRadians(-x2)) * Math.cos(Math.toRadians( - y1 + y2));
    }
}
