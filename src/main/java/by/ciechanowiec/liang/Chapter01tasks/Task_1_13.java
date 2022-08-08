package by.ciechanowiec.liang.Chapter01tasks;

public class Task_1_13 {
    private static double a = 3.4;
    private static double b = 50.2;
    private static double c = 2.1;
    private static double d = 0.55;
    private static double e  = 44.5;
    private static double f = 5.9;

    public static void main(String[] args) {
        System.out.print("x = ");
        System.out.println((e * d - b * f) / (a * d - b * c));
        System.out.print("y = ");
        System.out.println((a * f - e * c) / (a * d - b * c));
    }
}
