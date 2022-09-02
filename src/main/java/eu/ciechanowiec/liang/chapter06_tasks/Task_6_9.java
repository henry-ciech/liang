package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_9 {

    public static void main(String[] args) {
        System.out.println("Feet\t\tMeters\t\t|\t\t Meters\t\t Feet");
        System.out.println("-------------------------------------------------");

        for (double i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%-12.1f%-12.1f|%12.1f%12.1f%n", i, feetToMeters(i), j, metersToFeet(j) );
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
