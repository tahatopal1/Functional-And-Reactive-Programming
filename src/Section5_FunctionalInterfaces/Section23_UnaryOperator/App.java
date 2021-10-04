package Section5_FunctionalInterfaces.Section23_UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30, 40 ,50);

        UnaryOperator<Integer> operator = i -> i * 100;
        List<Integer> newList = mapper(list, operator);
        System.out.println(newList);

        List<String> sList = mapper(List.of("Productivity", "Robust", "Rapid"), s -> s.substring(0, 5));
        System.out.println(sList);
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> nList = new ArrayList<>();
        for (T t : list) {
            nList.add(operator.apply(t));
        }
        return nList;
    }
}
