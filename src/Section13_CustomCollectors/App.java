package Section13_CustomCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class App {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 6, 8, 9, 0, 1, 52, 5, 61, 8, 9, 98, 0, 18, 23);
        Collector<Integer, ArrayList<Integer>, ArrayList<Integer>> toList = Collector.of(ArrayList::new,
            (list, e) -> list.add(e), (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        }, Collector.Characteristics.IDENTITY_FINISH);

        ArrayList<Integer> evens = numbers.stream().filter(e -> e % 2 == 0).collect(toList);
        evens.forEach(System.out::println);


    }
}
