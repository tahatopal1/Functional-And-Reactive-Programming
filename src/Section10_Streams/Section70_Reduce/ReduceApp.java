package Section10_Streams.Section70_Reduce;

import java.util.stream.Stream;

public class ReduceApp {
    public static void main(String[] args) {

        Integer reduce = Stream.of(1, 2, 34, 56, 76, 87, 89, 90)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Here is the sum: " + reduce);

    }
}
