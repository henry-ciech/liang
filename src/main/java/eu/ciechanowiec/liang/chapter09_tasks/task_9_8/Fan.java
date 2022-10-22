package eu.ciechanowiec.liang.chapter09_tasks.task_9_8;

class Fan {

    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

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

    @Override
    public String toString() {
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
