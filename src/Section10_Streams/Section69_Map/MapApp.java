package Section10_Streams.Section69_Map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapApp {
    public static void main(String[] args) {

        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(n -> n * 25)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
