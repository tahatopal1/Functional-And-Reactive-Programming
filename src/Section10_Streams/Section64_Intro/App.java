package Section10_Streams.Section64_Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        // We don't have to write this lengthy code
        List<Book> popularHorrorBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equals("Horror") && book.getRating() > 3)
                popularHorrorBooks.add(book);
        }

        // After Java 8
        // Flexible, concise, easy to read & understand
        books.stream().filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());
    }
}
