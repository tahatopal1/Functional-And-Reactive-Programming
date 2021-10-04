package Section7_Optional.Section35_Operators;

import java.util.Optional;

public class App2 {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");
        Optional<String> emptyOptional = Optional.empty();

        // ifPresent
        optional.ifPresent(System.out::println);
        emptyOptional.ifPresent(System.out::println); // Nothing happens

        // ifPresentOrElse
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

        // stream
        optional.stream().forEach(System.out::println);
        Optional.empty().stream().forEach(System.out::println); // Nothing happens

        // or
        System.out.println("------------");
        optional.or(() -> Optional.of("New Value"))
                                    .ifPresent(s -> System.out.println("Value: " + s));
        emptyOptional.or(() -> Optional.of("New value"))
                                    .ifPresent(s -> System.out.println("Value: " + s));


        try {
            Optional.empty().or(() -> null).ifPresent(System.out::println);
        }catch (Exception e){
            Optional.ofNullable(e).ifPresent(System.out::println);
        }

        // equals: both are empty or their values are equal via equals() method
        boolean result = optional.equals(Optional.of("Value"));
        System.out.println(result);

        // hashcode: returns hashcode of the value
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode()); // Returns 0

    }
}
