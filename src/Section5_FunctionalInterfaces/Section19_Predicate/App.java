package Section5_FunctionalInterfaces.Section19_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Brilliant");
        list.add("");
        list.add("Productive");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        list = filterList(list, s -> !s.isEmpty());
        System.out.println(list);

        /* --------------------------------------- */

        List<Integer> numbList = List.of(1,4,5,6,7,12,33,51);
        Predicate<Integer> numbFilter = e -> e % 2 == 0;

        List<Integer> numbers = genericFilterList(numbList, numbFilter);
        System.out.println(numbers);

        numbers = genericFilterList(numbList, e -> e % 3 == 0);
        System.out.println(numbers);

    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> nList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s))
                nList.add(s);
        }
        return nList;
    }

    private static <T> List<T> genericFilterList(List<T> list, Predicate<T> predicate){
        List<T> nList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                nList.add(t);
        }
        return nList;
    }

}
