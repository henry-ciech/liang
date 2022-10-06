package eu.ciechanowiec.liang.chapter09_tasks.task_9_5;

import java.util.GregorianCalendar;

class Calendar {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.printf("Date (day/month/year): %d/%d/%d%n", calendar.get(GregorianCalendar.DAY_OF_MONTH),
                calendar.get(GregorianCalendar.MONTH) + 1, calendar.get(GregorianCalendar.YEAR));

        calendar.setTimeInMillis(1234567898765L);

        System.out.printf("Date (day/month/year): %d/%d/%d%n", calendar.get(GregorianCalendar.DAY_OF_MONTH),
                calendar.get(GregorianCalendar.MONTH) + 1, calendar.get(GregorianCalendar.YEAR));
    }
}
