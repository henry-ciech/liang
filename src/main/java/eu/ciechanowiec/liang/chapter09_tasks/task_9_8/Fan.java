package eu.ciechanowiec.liang.chapter09_tasks.task_9_8;

class Fan {

    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int LOW = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    void setColor(String color) {
        this.color = color;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    double getRadius() {
        return radius;
    }

    int getSpeed() {
        return speed;
    }

    String getColor() {
        return color;
    }

    boolean getOn() {
        return on;
    }

    String fanVariables() {
        String text;
        if (on) {
            text = String.format("""
                color: %s
                radius: %.1f
                speed: %s
                """, getColor(), getRadius(), getSpeed());
        } else {
            text = String.format("""
                color: %s
                radius: %.1f
                fan is off
                """, getColor(), getRadius());
        }
        return text;
    }
}
