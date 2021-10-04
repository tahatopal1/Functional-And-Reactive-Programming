package Section5_FunctionalInterfaces.Section20_Consumer;

import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(34, 67, 8, 23, 89, 90);
        Consumer<Integer> consumer = e -> System.out.println(e);
        consumer.accept(56);

        printElements(list, consumer);

        List<String> strList = List.of("Productive", "Creative", "Robust", "Perfect");

        printElementsWithGenerics(strList, str -> System.out.println(str));
        printElementsWithGenerics(list, e -> System.out.println(e*2));



    }

    private static void printElements(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer number : list) {
            consumer.accept(number);
        }
    }

    private static <T> void printElementsWithGenerics(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
