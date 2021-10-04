package Section10_Streams.Section64_Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAreNotContainers {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Block", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        Stream<Book> stream = books.stream();

        stream.filter(book -> book.getGenre().equals("Horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Throws error; streams can be used for once because they are mutable
        // Streams are nothing but a fancy iterator those cannot be used as a container
        stream.filter(book -> book.getGenre().equals("Romance"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
