package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_33 {

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        long currentHour = (int) (totalHours % 24);
        long totalDays = totalHours / 24;
        int currentYear = (int) (totalDays / 365) + 1970;

        long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;

        if (currentHour > 0) {
            daysInCurrentYear++;
        }

        int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);

        String month = getMonthName(currentMonthNum);

        int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);

        int today = (int) daysInCurrentYear - daysTillCurrentMonth;

        System.out.printf("Current date and time: %s %s, %d %d:%d:%d%n",
                month, today, currentYear, currentHour, currentMinute, currentSecond);
    }

    private static int numberOfLeapYearsSince1970(long year) {
        int count = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i))count++;
        }

        return count;
    }

    private static int getMonthFromDays(int year, int days) {
        int dayTracker = 0;
        for (int i = 1; i <= 12; i++) {
            dayTracker += getNumberOfDaysInMonth(year, i);
            if (dayTracker > days) {
                return i;
            }
        }

        return 12;
    }

    private static int getNumOfDaysToReachThatMonth(int year, int month) {
        int dayTracker = 0;
        for (int i = 1; i < month; i++) {
            dayTracker += getNumberOfDaysInMonth(year, i);
        }

        return dayTracker;
    }

    private static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }

        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "";
            }
        }
    }
}
