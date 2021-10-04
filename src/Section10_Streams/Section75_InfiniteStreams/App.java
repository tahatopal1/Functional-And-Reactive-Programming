package Section10_Streams.Section75_InfiniteStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Stream.iterate(0, i -> ++i)
                .limit(15) // If we don't put a limit, it will work forever
                .forEach(System.out::println);
        System.out.println("***********************");

        Stream.iterate(5, i -> ++i)
                .limit(15)
                .forEach(System.out::println);

    }
}
