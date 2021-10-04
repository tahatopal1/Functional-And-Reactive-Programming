package Section10_Streams.Section78_StatelessOperations;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        // Since skip and limits functions are both stateful operation, we should use stream instead of parallel stream
        List<Integer> collect = list.stream()
                .skip(2) // JavaDoc: stateful intermediate operation
                .limit(5) // JavaDoc: short-circuiting stateful intermediate operation
                .collect(Collectors.toList());
    }
}
