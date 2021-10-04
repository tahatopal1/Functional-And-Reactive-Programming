package Section10_Streams.Section73_NumericMethods;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {

        // IntStream
        // DoubleStream
        // LongStream

        // Sum: primitive
        int sum = IntStream.of(1,5,10).sum();
        int sumEmpty = IntStream.of().sum(); // IntStream.empty().sum();
        System.out.println(sum);
        System.out.println(sumEmpty);
        System.out.println("******************************");

        // Max: primitive optional
        OptionalInt maxOptional = IntStream.of(12, 44, 23).max();
        maxOptional.ifPresent(System.out::println);
        System.out.println("******************************");

        // Min: primitive optional
        IntStream.of(5,12,33,1).min().ifPresent(System.out::println);
        // or
        int asInt = IntStream.of(5, 12, 33, 1).min().getAsInt();
        System.out.println(asInt);
        System.out.println("******************************");

        // Average: primitive optional (OptionalDouble)
        OptionalDouble average = IntStream.of(1, 2, 3, 4, 5).average();
        double asDouble = average.getAsDouble();
        System.out.println(asDouble);
        System.out.println("******************************");

        // Summary Statistics
        IntSummaryStatistics summaryStatistics = IntStream.of(1, 2, 55, 32, 6).summaryStatistics();
        System.out.println(summaryStatistics);

    }
}
