package Section3_LambdaAndFunctionalInterface.Section8_ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        // Imperative
        int sumOfEvens = 0;
        for(int i = 0; i < 100; i++){
            if (i % 2 == 0)
                sumOfEvens += i;
        }

        System.out.println("Sum imperative: " + sumOfEvens);

        // Declarative
        int sum = IntStream.rangeClosed(0, 99)
                .filter(value -> value % 2 == 0)
                .reduce((x, y) -> x + y) // we can use sum() aswell
                .getAsInt();

        System.out.println("Sum declarative: " + sum);

    }

}
