package Section14_CollectionsFunctional.Section102_Map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapApp {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("1237589020", "John");
        contacts.put("1237060020", "John");
        contacts.put("1223489090", "Jake");
        contacts.put("1241189450", "Peter");
        contacts.put("1256589110", "Harry");
        contacts.put("1003621020", "Lee");

        // Traversal
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("*************************************");

        // Exactly the same thing
        contacts.forEach((k, v) -> System.out.println(k + "-" + v));
        System.out.println("*************************************");

        // Filter
        contacts.entrySet().stream()
                .filter(entry -> "John".equalsIgnoreCase(entry.getValue()))
                .forEach(System.out::println);
        System.out.println("*************************************");

        // Collecting
        Map<String, String> filteredMap = contacts.entrySet().stream()
                .filter(entry -> "John".equalsIgnoreCase(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("*************************************");

        // Map
        contacts.entrySet().stream()
                .map(Map.Entry::getValue)
                .forEach(System.out::println);
        System.out.println("*************************************");

        String joinedStr = contacts.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.joining(", "));
        System.out.println(joinedStr);
        System.out.println("***********************************");

        // Sorting
        contacts.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue));

        contacts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        LinkedHashMap<String, String> sortedMap = contacts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        sortedMap.forEach((k, v) -> System.out.println(k + "-" + v));
        System.out.println("***********************************");

        // Reducing
        Map<String, Double> marks = new HashMap<>();
        marks.put("Science", 66.00);
        marks.put("Maths", 78.00);
        marks.put("English", 90.00);

        marks.values().stream()
                .mapToDouble(value -> value)
                .average()
                .ifPresent(System.out::println);

    }
}
