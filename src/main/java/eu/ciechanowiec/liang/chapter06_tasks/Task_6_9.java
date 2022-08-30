package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_9 {

    public static void main(String[] args) {
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("-------------------------------------------------");

        for (double i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%4.1f     ", i);
            System.out.printf("%6.3f", feetToMeters(i));
            System.out.print("     |     ");
            System.out.printf("%-11.1f", j);
            System.out.printf("%7.3f&%n", metersToFeet(j));
        }
    }

    private static double feetToMeters(double feet) {
        double meters;
        meters = 0.305 * feet;

        return meters;
    }

    static double metersToFeet(double meters) {
        double feet;
        feet = 3.279 * meters;

        return feet;
    }
}
