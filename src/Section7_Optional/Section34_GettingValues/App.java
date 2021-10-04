package Section7_Optional.Section34_GettingValues;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);
        Integer b = optional.get();
        System.out.println(b);

        Optional<Integer> emptyOptional = Optional.empty();
        //Integer c = emptyOptional.get();  Will throw "java.util.NoSuchElementException"

        // isPresent: Returns a boolean
        boolean isPresent = emptyOptional.isPresent();
        System.out.println("is emptyOptional present: " + isPresent);

        // orElse: Sets a default value if the value is absent
        Integer optionalOrElse = optional.orElse(5);
        Integer emptyOptionalOrElse = emptyOptional.orElse(10);

        System.out.println("optionalOrElse: " + optionalOrElse);
        System.out.println("emptyOptionalOrElse: " + emptyOptionalOrElse);

        // orElseGet: Sets a default value by using a Supplier
        Optional<Double> doubleOptional = Optional.empty();
        Double optdouble = doubleOptional.orElseGet(Math::random);
        System.out.println("optdouble " + optdouble);

        // orElseThrow: Throws a specific
        try {
            Integer orElseThrowVal =
                    emptyOptional.orElseThrow(() -> new IllegalArgumentException("Optional orElseThrow trial."));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
