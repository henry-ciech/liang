package eu.ciechanowiec.liang.chapter09_tasks.task_9_8;

class TestFan {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        fan2.setOn(false);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println("Fan1:");
        System.out.println(fan1);

        System.out.println("Fan2:");
        System.out.print(fan2);
    }
}
