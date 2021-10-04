package Section6_MethodReferences.Section28_MethodReference;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        // Consumer reference
        // sout; takes something, returns nothing
        List<String> strList = List.of("Productive", "Rapid", "Robust");
        printAll(strList, System.out :: println); // Instance method reference (System.out returns an object)

        // Supplier reference
        // Math.random(); takes nothing, returns something
        Supplier<Double> supplier = Math :: random; // Static method reference
        System.out.println(supplier.get());

    }

    private static <T> void printAll(List<T> strList, Consumer<T> consumer) {
        for (T t : strList) {
            consumer.accept(t);
        }
    }
}
