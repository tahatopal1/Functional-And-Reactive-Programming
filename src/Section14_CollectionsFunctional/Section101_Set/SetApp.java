package Section14_CollectionsFunctional.Section101_Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetApp {
    public static void main(String[] args) {

        Set<Integer> set = Set.of(3, 56, 7, 82, 39);

        // Traversal
        set.forEach(System.out::println);
        System.out.println("---------------------------------");

        // Filter
        set.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
        System.out.println("---------------------------------");

        // Sorting
        set.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------------");

        // or
        TreeSet<Integer> treeSet = set.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);
        System.out.println("---------------------------------");


        // Mapping
        Set<Double> hashSet = set.stream()
                .map(Double::valueOf)
                .collect(Collectors.toSet());
        hashSet.forEach(System.out::println);
        System.out.println("---------------------------------");

        // Reducing
        set.stream()
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

    }
}
