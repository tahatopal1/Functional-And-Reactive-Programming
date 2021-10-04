package Section11_Spliterators.Section_83.Characteristics;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(1);

        Stream<Integer> stream = list.stream();
        Spliterator<Integer> spliterator = stream.spliterator();
        int bits = spliterator.characteristics();
        System.out.println(Integer.bitCount(bits));

        // OR
        System.out.println(Integer.bitCount(bits | 0x00000010));

        // AND
        System.out.println(bits & 0x00000010);
        System.out.println(spliterator.hasCharacteristics(0x00000010));

    }
}
