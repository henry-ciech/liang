package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_28 {

    // This task hasn't been finished. Below there is a scratch - it doesn't work correctly
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width and height:");
        double r1X = scanner.nextDouble();
        double r1Y = scanner.nextDouble();
        double r1Width = scanner.nextDouble();
        double r1Height = scanner.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width and height:");
        double r2X = scanner.nextDouble();
        double r2Y = scanner.nextDouble();
        double r2Width = scanner.nextDouble();
        double r2Height = scanner.nextDouble();

        double r1RightBoarder = r1X + r1Width / 2;
        double r1LeftBoarder = r1X + r1Width / 2;
        double r1UpperBoarder = r1Y + r1Height / 2;
        double r1LowerBoarder = r1Y + r1Height / 2;

        double r2RightBoarder = r2X + r2Width / 2;
        double r2LeftBoarder = r2X + r2Width / 2;
        double r2UpperBoarder = r2Y + r2Height / 2;
        double r2LowerBoarder = r2Y + r2Height / 2;

        System.out.println("r1RightBoarder " + r1RightBoarder);
        System.out.println("r1LeftBoarder " + r1LeftBoarder);
        System.out.println("r1UpperBoarder " + r1UpperBoarder);
        System.out.println("r1LowerBoarder " + r1LowerBoarder);

        System.out.println("r2RightBoarder " + r2RightBoarder);
        System.out.println("r2LeftBoarder " + r2LeftBoarder);
        System.out.println("r2UpperBoarder " + r2UpperBoarder);
        System.out.println("r2LowerBoarder " + r2LowerBoarder);

        if (r1LeftBoarder > r2LeftBoarder
         && r1RightBoarder > r2RightBoarder
         && r1UpperBoarder > r2UpperBoarder
         && r1LowerBoarder > r2LowerBoarder) {
            System.out.println("r2 is inside r1");
        } else if (r2LeftBoarder > r1RightBoarder) {
            System.out.println("r2 does not overlap r1");
            System.exit(0);
        } else if (r2LowerBoarder > r1UpperBoarder) {
            System.out.println("r2 does not overlap r1");
            System.exit(1);
        } else if (r2RightBoarder > r1LeftBoarder) {
            System.out.println("r2 does not overlap r1");
            System.exit(2);
        } else if (r2UpperBoarder > r1LowerBoarder) {
            System.out.println("r2 does not overlap r1");
            System.exit(3);
        }
        else {
            System.out.println("r2 overlap r1");
        }
    }
}
