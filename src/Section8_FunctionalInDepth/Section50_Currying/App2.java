package Section8_FunctionalInDepth.Section50_Currying;

import java.util.Optional;
import java.util.function.Function;

public class App2 {
    public static void main(String[] args) {

        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;

        // So that, we don't have to use two parameterized method and pass the value of '1' again and again

        Function<Integer, Integer> incrementByOne = fun1.apply(1);

        Optional.of(incrementByOne.apply(5)).ifPresent(System.out::println);
        Optional.of(incrementByOne.apply(10)).ifPresent(System.out::println);
        Optional.of(incrementByOne.apply(15)).ifPresent(System.out::println);


    }
}
