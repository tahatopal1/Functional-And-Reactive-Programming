package Section8_FunctionalInDepth.Section50_Currying;

import java.util.Optional;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;
        Function<Integer, Integer> fun2 = fun1.apply(5);
        Integer sum = fun2.apply(10);
        System.out.println(sum);

        // Or
        Optional.of(fun1.apply(3).apply(5)).ifPresent(System.out::println);

    }
}
