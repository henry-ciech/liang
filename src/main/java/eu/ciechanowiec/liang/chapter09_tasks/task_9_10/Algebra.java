package eu.ciechanowiec.liang.chapter09_tasks.task_9_10;

record Algebra(double a, double b, double c) {

    double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
