package eu.ciechanowiec.liang.chapter09_tasks.task_9_6;

class StopWatch {

    private double startTime;
    private double endTime;

    double getStartTime() {
        return startTime;
    }

    double getEndTime() {
        return endTime;
    }

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    void start() {
        startTime = System.currentTimeMillis();
    }

    void stop() {
        endTime = System.currentTimeMillis();
    }

    double getElapsedTime() {
        return endTime - startTime;
    }
}
