package Section9_DesignPatternsFunctional.Section56_Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilter {

    public static List<Stock> bySymbol(List<Stock> list, String symbol){
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (stock.getCode().equals(symbol))
                filteredData.add(stock);
        }
        return filteredData;
    }

    public static List<Stock> byPrice(List<Stock> list, double price){
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (stock.getCost() > price)
                filteredData.add(stock);
        }
        return filteredData;
    }

    // After creating this method we won't need methods above
    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p){
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (p.test(stock))
                filteredData.add(stock);
        }
        return filteredData;
    }

}
