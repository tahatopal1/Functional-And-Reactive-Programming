package Section5_FunctionalInterfaces.Section25_BinaryOperator;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (s, s2) -> s.concat(s2);
        String result = binaryOperator.apply("Robust ", "Analysis");
        System.out.println(result);
    }
}
