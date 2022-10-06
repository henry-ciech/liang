package eu.ciechanowiec.liang.chapter09_tasks.task_9_6;

class StopWatch {

    private double starTime;
    private double endTime;

    double getStarTime() {
        return starTime;
    }

    double getEndTime() {
        return endTime;
    }

    StopWatch() {
        starTime = System.currentTimeMillis();
    }

    void start() {
        starTime = System.currentTimeMillis();
    }

    void stop() {
        endTime = System.currentTimeMillis();
    }

    double getElapsedTime() {
        return endTime - starTime;
    }
}
