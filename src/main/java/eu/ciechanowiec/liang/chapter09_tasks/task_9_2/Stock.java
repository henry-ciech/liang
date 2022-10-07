package eu.ciechanowiec.liang.chapter09_tasks.task_9_2;

class Stock {

    private final String symbol;
    private final String name;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent(double currentPrice, double previousClosingPrice) {
        if (currentPrice > previousClosingPrice) {
            return ((currentPrice - previousClosingPrice) / ((currentPrice + previousClosingPrice) / 2)) * 100;
        } else {
            return ((previousClosingPrice - currentPrice) / ((currentPrice + previousClosingPrice) / 2)) * 100;
        }
    }
}
