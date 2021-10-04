package Section10_Streams.Section74_BoundedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,7,9,4);
        Stream<Integer> stream = list.stream();

        // 1. stream() on a collection
        // We can't use streams with map. We can use streams with key, value or entry sets
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
        Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();
        Stream<Integer> keyStream = map.keySet().stream();
        Stream<String> valuesStream = map.values().stream();

        // 2. of() method to create Stream class
        Stream<String> stringStream = Stream.of("Hey!", "Hello", "What's up?");

        // 3. stream() of Arrays utility
        Integer[] arr = {3, 5, 7, 89, 22};
        Stream<Integer> arrStream = Arrays.stream(arr);

        int[] arr2 = {3,1,2,5,6};
        IntStream intStream = Arrays.stream(arr2);

        // 4. Builder option
        Stream.Builder<Object> objectBuilder = Stream.builder();
        Stream.Builder<Integer> integerBuilder = Stream.builder();

        integerBuilder.add(5);
        integerBuilder.add(4).andThen(System.out::println).accept(5);
    }
}
