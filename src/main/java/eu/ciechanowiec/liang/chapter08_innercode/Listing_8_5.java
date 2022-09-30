package eu.ciechanowiec.liang.chapter08_innercode;

import java.util.Scanner;

class Listing_8_5 {

    private static final int NUMBER_OF_DAYS = 10;
    private static final int NUMBER_OF_HOURS = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            double temperature = scanner.nextDouble();
            double humidity = scanner.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;

            for (int i = 0; i < NUMBER_OF_DAYS; i++) {
                double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
                for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                    dailyTemperatureTotal += data[i][j][0];
                    dailyHumidityTotal += data[i][j][1];
                }

                System.out.println("Day " + i + "'s average temperature is "
                        + dailyTemperatureTotal / NUMBER_OF_HOURS);
                System.out.println("Day " + i + "'s average humidity is "
                        + dailyHumidityTotal / NUMBER_OF_HOURS);
            }
        }
    }
}
