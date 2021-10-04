package Section8_FunctionalInDepth.Section47_Chaining;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = s -> s+2;
        Function<Integer, Integer> f2 = s -> s*2;
        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }
}
