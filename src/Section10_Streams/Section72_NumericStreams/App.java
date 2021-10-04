package Section10_Streams.Section72_NumericStreams;

import Section10_Streams.Section64_Intro.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Block", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .ifPresent(System.out::println);

        // map: Objects
        // mapToDouble: primitive double

        IntStream streamInt = IntStream.of(1,3,5,6);
        DoubleStream streamDoub = DoubleStream.of(1,3,5,12);
        LongStream streamLong = LongStream.of(1L,3L,5L,8L);

        // Converting to stream with generic type of Integer
        Stream<Integer> boxed = streamInt.boxed();

        // Another way to convert a generic type of stream
        Stream<Double> doubleStream = streamDoub.mapToObj(value -> value);

    }
}
