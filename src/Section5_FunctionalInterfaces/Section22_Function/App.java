package Section5_FunctionalInterfaces.Section22_Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        List<String> list = List.of("Productive", "Robust", "Fast");
        Function<String, Integer> function = e -> e.length();
        List<Integer> lenList = map(list, function);
        System.out.println(lenList);

        List<String> stringList = map(list, s -> s.substring(0, 4));
        System.out.println(stringList);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> nList = new ArrayList<>();
        for (T t : list) {
            nList.add(function.apply(t));
        }
        return nList;
    }
}
