package eu.ciechanowiec.liang.chapter10_tasks.task_10_1;

class Time {

    private int hour;
    private int minute;
    private int second;

    Time() {
        hour = (int) (System.currentTimeMillis() / 1000 / 60 / 60 % 24);
        minute = (int) (System.currentTimeMillis() / 1000 / 60 %  24);
        second = (int) (System.currentTimeMillis() / 1000 % 24);
    }

    Time(long elapsedTime) {
        hour = (int) (elapsedTime / 1000 / 60 / 60 % 24);
        minute = (int) (elapsedTime / 1000 / 60 %  24);
        second = (int) (elapsedTime / 1000 % 24);
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    int getSecond() {
        return second;
    }

    void setTime(long elapseTime) {
        hour = (int) (elapseTime / 1000 / 60 / 60 % 24);
        minute = (int) (elapseTime / 1000 / 60 %  24);
        second = (int) (elapseTime / 1000 % 24);
    }
}
