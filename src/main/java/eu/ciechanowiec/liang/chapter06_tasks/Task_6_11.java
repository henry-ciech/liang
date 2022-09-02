package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_11 {

    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");

        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%d\t\t\t\t%.1f%n", i, computeCommission(i));
        }
    }

    private static double computeCommission(double salesAmount) {
        double commission;
        double balance;

            balance = commission = 0;
            salesAmount += 0.01;

            if (salesAmount > 10000) {
                commission += (balance = salesAmount - 10000) * 0.12;
            }

            if (salesAmount > 5000) {
                commission += (balance -= balance - 5000) * 0.10;
            }

            if (salesAmount > 0) {
                commission += balance * 0.08;
            }

            return commission;
        }

    }
