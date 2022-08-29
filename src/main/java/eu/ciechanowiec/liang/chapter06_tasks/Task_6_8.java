package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_8 {

    public static void main(String[] args) {
        System.out.println("Celsius \tFahrenheit  |    \tFahrenheit \t Celsius");
        System.out.println("-------------------------------------------------");

        for (double i = 40, j = 120; j >= 30; i--, j -= 10) {
            System.out.printf("%-12.1f%-11.1f|%13.1f %11.1f%n", i, celsiusToFahrenheit(i), j, fahrenheitToCelsius(j) );
        }
    }

    static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;
    }
}
