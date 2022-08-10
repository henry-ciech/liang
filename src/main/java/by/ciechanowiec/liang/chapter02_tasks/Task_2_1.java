package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius");

        double celsiusDegree = scanner.nextDouble();

        double fahrenheitDegree = (9.0 / 5) * celsiusDegree + 32;
        System.out.println(celsiusDegree + " Celsius is " + fahrenheitDegree + " Fahrenheit4");
    }
}
