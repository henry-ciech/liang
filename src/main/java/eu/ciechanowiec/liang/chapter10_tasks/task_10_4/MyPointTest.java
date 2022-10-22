package eu.ciechanowiec.liang.chapter10_tasks.task_10_4;

class MyPointTest {

    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);

        System.out.printf("Distance between two points: %.1f%n", myPoint1.distance(myPoint1, myPoint2));
    }
}
