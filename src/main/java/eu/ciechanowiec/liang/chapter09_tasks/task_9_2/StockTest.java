package eu.ciechanowiec.liang.chapter09_tasks.task_9_2;

class StockTest {

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        System.out.printf("Percent stock price change: %.1f%%%n"
                , stock.getChangePercent(34.35, 34.5));
    }
}
