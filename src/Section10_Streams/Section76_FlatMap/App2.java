package Section10_Streams.Section76_FlatMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {

        Path path =
                Paths.get("C:\\Users\\tahat\\Functional-And-Reactive-Programming\\src\\Section10_Streams\\Section76_FlatMap\\notes");

        try(Stream<String> notebook = Files.lines(path);) {
            notebook.flatMap(s -> Arrays.stream(s.split(" ")))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
