package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_15 {

    public static void main(String[] args) {
        System.out.print("""
                Taxable      Single       Married Joint       Married      Head of
                Income                    or Qualifying       Separate     House hold
                                          Widow(er)
                """);

        for (int i = 50000; i <= 60000; i += 50) {
            computeTax(i);
        }
    }

    static void computeTax(int income) {
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        double tax4 = 0;

        tax1 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

        tax2 = 16700 * 0.10 + (income - 16700) * 0.15;

        tax3 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

        tax4 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;

        System.out.printf("%-13d%-13d%-20d%-13d%d%n", income, Math.round(tax1), Math.round(tax2), Math.round(tax3), Math.round(tax4));
    }
}
