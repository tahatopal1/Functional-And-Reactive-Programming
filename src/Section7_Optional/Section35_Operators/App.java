package Section7_Optional.Section35_Operators;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");
        Optional<String> emptyOptional = Optional.empty();


        // map() **
        Optional<String> mapped = optional.map(s -> "Replaced");
        System.out.println(mapped.get());

        mapped = emptyOptional.map(s -> "Replaced");
        try {
            System.out.println(mapped.get());
        }catch (Exception e){
            System.out.println(e + ": Cannot convert an empty optional.");
        }

        // To get rid of NoSuchElementException
        System.out.println(emptyOptional.map(s -> "Replaced").orElse("Default"));


        // filter() **
        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("value"));
        System.out.println(filter.get());

        // flatMap()
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced"));
        System.out.println("FlatMap: " + flatMap.get());

    }
}
