package by.ciechanowiec.liang.chapter01_tasks;

public class Task_1_13 {
    private static final double a = 3.4;
    private static final double b = 50.2;
    private static final double c = 2.1;
    private static final double d = 0.55;
    private static final double e  = 44.5;
    private static final double f = 5.9;

    public static void main(String[] args) {
        System.out.print("x = ");
        System.out.println((e * d - b * f) / (a * d - b * c));
        System.out.print("y = ");
        System.out.println((a * f - e * c) / (a * d - b * c));
    }
}
