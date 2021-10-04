package Section10_Streams.Section71_StreamsAreLazy;

import Section10_Streams.Section64_Intro.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Block", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        Stream<Book> stream = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .peek(book -> System.out.println("Filtered book: " + book))
                .filter(book -> book.getRating() > 3);

        // This console sentence will be printed first since streams are lazy
        System.out.println("Filtering is done");

        // Streams won't be performed as long as we use a terminal method such as 'forEach' or 'collect' (because it's lazy)
        stream.forEach(System.out::println);



    }
}
