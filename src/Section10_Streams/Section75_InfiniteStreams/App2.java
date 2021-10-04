package Section10_Streams.Section75_InfiniteStreams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        Stream.generate(() -> "Hello")
                .limit(10)
                .forEach(System.out::println);

        System.out.println("*******************");

        DoubleStream.generate(new Random()::nextDouble)
                .limit(10)
                .forEach(System.out::println);
    }
}
