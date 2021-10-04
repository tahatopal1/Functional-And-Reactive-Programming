package Section9_DesignPatternsFunctional.Section56_Strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyApp {
    public static void main(String[] args) {

        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("MSFT", 166.86, 45));
        stockList.add(new Stock("Google", 99, 12));
        stockList.add(new Stock("AMZ", 1866.44, 45));
        stockList.add(new Stock("GOOGL", 1840.20, 4));
        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("AMZ", 1866.44, 9));

        StockFilter.bySymbol(stockList, "AMZ").forEach(System.out::println);
        System.out.println("---------------------------------");
        StockFilter.byPrice(stockList,400).forEach(System.out::println);
        System.out.println("---------------------------------");

        // By creating filter method, we don't have to create various methods for every functionality
        // We can pass the functionality via Predicate object (it could be Consumer, Function or Supplier aswell)
        // We don't even need to create a new class and to put a filter method in it
        // We already have 'filter' method inside function package
        // We have handled two different functionality with one 'filter' method
        StockFilter.filter(stockList, stock -> stock.getCode().equals("AMZ")).forEach(System.out::println);
        StockFilter.filter(stockList, stock -> stock.getCost() > 500).forEach(System.out::println);

    }
}
