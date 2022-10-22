package eu.ciechanowiec.liang.chapter09_tasks.task_9_12;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class LinearEquation {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    boolean isSolvable() {
        return a * d - b * c != 0;
    }

    double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
