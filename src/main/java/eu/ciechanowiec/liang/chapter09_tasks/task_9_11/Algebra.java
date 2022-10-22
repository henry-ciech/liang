package eu.ciechanowiec.liang.chapter09_tasks.task_9_11;

record Algebra(double a, double b, double c, double d, double e, double f) {

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
