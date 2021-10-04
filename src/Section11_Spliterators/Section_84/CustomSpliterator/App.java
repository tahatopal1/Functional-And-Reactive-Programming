package Section11_Spliterators.Section_84.CustomSpliterator;

import Section10_Streams.Section64_Intro.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\tahat\\Functional-And-Reactive-Programming\\src\\Section11_Spliterators\\Section_84\\CustomSpliterator\\Books");
        try(Stream<String> lines = Files.lines(path);) {
            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> spliterator = new BookSpliterator(baseSpliterator);

            Stream<Book> stream = StreamSupport.stream(spliterator, false);
            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
