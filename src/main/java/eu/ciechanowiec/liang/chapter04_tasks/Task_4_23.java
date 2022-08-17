package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = scanner.nextLine();

        System.out.println("Enter number of hours worked in a week:");
        double workedHours = scanner.nextDouble();

        System.out.println("Enter hourly pay rate:");
        double hourlyPayRate = scanner.nextDouble();

        System.out.println("Enter federal tax withholding rate:");
        double federalTaxWithholdingRate = scanner.nextDouble();

        System.out.println("Enter state tax withholding rate:");
        double stateTaxWithholdingRate = scanner.nextDouble();

        double grossPay = hourlyPayRate * workedHours;
        double federalWithHolding = grossPay * federalTaxWithholdingRate;
        int federalWithHoldingPercent = (int) (federalTaxWithholdingRate * 100);
        double stateWithHolding = grossPay * stateTaxWithholdingRate;
        int stateWithHoldingPercent = (int) (stateTaxWithholdingRate * 100);
        double totalDeduction = federalWithHolding + stateWithHolding;
        double netPay = grossPay - totalDeduction;

        System.out.printf("""
                Employee Name: %s
                Hours Worked: %4.2f
                Pay Rate: $%4.2f
                Gross Pay: $%4.2f
                Deduction:
                  Federal Withholding (%d%%): $%4.2f
                  State Withholding (%d%%): $%4.2f
                  Total Deduction: $%4.2f
                Net Pay: $%4.2f%n
                """, name, workedHours, hourlyPayRate, grossPay,
                federalWithHoldingPercent, federalWithHolding,
                stateWithHoldingPercent, stateWithHolding, totalDeduction,
                netPay);
    }
}
