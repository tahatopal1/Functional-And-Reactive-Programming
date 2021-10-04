package Section6_MethodReferences.Section28_MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ClassInstanceMethodReference {
    public static void main(String[] args) {

        //System.out.println(mapper(List.of("Robust", "Productive", "Eager"), s -> s.length()));
        System.out.println(mapper(List.of("Robust", "Productive", "Eager"), String :: length));

        // Eventhough length() method takes no parameter, needs to use String object

    }

    public static <T, R> List<R> mapper(List<T> list, Function<T, R> function){
        List<R> nList = new ArrayList<>();
        for (T t : list) {
            nList.add(function.apply(t));
        }
        return nList;
    }

}
