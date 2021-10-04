package Section5_FunctionalInterfaces.Section24_BiFunction;

import java.util.function.BiFunction;

public class App {
    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction = (a,b) -> a.concat(b);
        String result = biFunction.apply("Robust ", "Productivity");
        System.out.println(result);

    }
}
