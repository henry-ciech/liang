package eu.ciechanowiec.liang.chapter10_tasks.task_10_1;

class TimeTest {

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

//        System.out.printf("""
//                time1: %02d:%02d:%02d
//                time2: %02d:%02d:%02d
//                time3: %02d:%02d:%02d
//                """,
//                time1.getHour(), time1.getMinute(), time1.getSecond(),
//                time2.getHour(), time2.getMinute(), time2.getSecond(),
//                time3.getHour(), time3.getMinute(), time3.getSecond());
    }
}
