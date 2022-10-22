package eu.ciechanowiec.liang.chapter10_tasks.task_10_14;

class MyDateTest {

    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);

        System.out.printf("Time myDate1 day/month/year: %d/%d/%d%n", myDate1.getDay(), myDate1.getMonth() + 1,
                myDate1.getYear());
        System.out.printf("Time myDate2 day/month/year: %d/%d/%d%n", myDate2.getDay(), myDate2.getMonth() + 1,
                myDate2.getYear());
    }
}
