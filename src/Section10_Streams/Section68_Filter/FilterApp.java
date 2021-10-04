package Section10_Streams.Section68_Filter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterApp {
    public static void main(String[] args) {
        Stream.of(34, 678, 89, 4, 52, 31, 325, 6)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }
}
