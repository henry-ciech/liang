package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1");
        double pack1Weight = scanner.nextDouble();
        double pack1Price = scanner.nextDouble();
        double pack1AbsolutPrice = pack1Weight / pack1Price;

        System.out.println("Enter weight and price for package 2");
        double pack2Weight = scanner.nextDouble();
        double pack2Price = scanner.nextDouble();
        double pack2AbsolutPrice = pack2Weight / pack2Price;

        if (pack1AbsolutPrice > pack2AbsolutPrice) {
            System.out.println("Package 1 has a better price");
        } else if (pack2AbsolutPrice > pack1AbsolutPrice) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("Two packages have the same price");
        }
    }
}
