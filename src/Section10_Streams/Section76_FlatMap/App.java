package Section10_Streams.Section76_FlatMap;

import java.util.function.Function;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Stream<String> a = Stream.of("Hello", "Hi");
        Stream<String> b = Stream.of("Good Bye", "Take Care");

        Stream<Stream<String>> streamOfStream = Stream.of(a, b);
        Stream<String> pureStream = streamOfStream.flatMap(e -> e);
        pureStream.forEach(System.out::println);

        System.out.println("************");

        // In one sentence
        Stream<String> c = Stream.of("Hello", "Hi");
        Stream<String> d = Stream.of("Good Bye", "Take Care");
        Stream.of(c, d).flatMap(stringStream -> stringStream)
                                        .forEach(System.out::println);

        System.out.println("************");

        // With Function.identity
        Stream<String> e = Stream.of("Hello", "Hi");
        Stream<String> f = Stream.of("Good Bye", "Take Care");
        Stream.of(e, f).flatMap(Function.identity())
                .forEach(System.out::println);

    }
}
