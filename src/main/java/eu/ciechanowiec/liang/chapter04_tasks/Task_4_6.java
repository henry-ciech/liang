package eu.ciechanowiec.liang.chapter04_tasks;


class Task_4_6 {

    public static void main(String[] args) {
        double angle = Math.random() * 2 * Math.PI;
        double radius = 40.0;
        double x = radius * Math.cos(angle);
        double y = radius * Math.sin(angle);
        System.out.println("x = " + (int) (x * 100) / 100.0 + " " + " y = " + (int) (y * 100) / 100.0);
    }
}
