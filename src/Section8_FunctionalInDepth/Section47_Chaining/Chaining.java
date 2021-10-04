package Section8_FunctionalInDepth.Section47_Chaining;

import java.util.function.Consumer;

public class Chaining {
    public static void main(String[] args) {
        IConsumer<String> c1 = System.out::println;
        IConsumer<String> c2 = System.out::println;

        //c1.accept("Hello");
        //c2.accept("Hello");

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        }; // It's not making us feel like we are implementing chaining

        c3.accept("Hello");

        IConsumer<String> c4 = c1.thenAccept(c2); // A complete chain
        c4.accept("Hi");

        //IConsumer<String> anotherChain = c1.thenAccept(null);
        // (We have added Objects.requireNonNull(c2) so it prevents adding null
        //anotherChain.accept("Yup!"); // NullPointerException occurs


    }
}
