package Section14_CollectionsFunctional.Section100_List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(new Movie("Spotlight", 2015, "Hollywood"),
                new Movie("Avengers: Infinity War", 2018, "Hollywood"),
                new Movie("Inception", 2010, "Hollywood"),
                new Movie("Forrest Gump", 1994, "Hollywood"),
                new Movie("3 Idiots", 2009, "Bollywood"),
                new Movie("Beauty and the beast", 2017, "Hollywood"),
                new Movie("Slumdog Millionaire", 2008, "Bollywood")
        );

        // Traversal
        movies.forEach(System.out::println);
        System.out.println("**************************************************************");

        // Sorting
        //movies.sort(Comparator.naturalOrder()); We cannot use the since Movie class does not implement Comparable class
        movies.sort(Comparator.comparing(Movie::getReleaseYear));
        movies.forEach(System.out::println);
        System.out.println("**************************************************************");

        movies.sort((o1, o2) -> o2.getReleaseYear()-o1.getReleaseYear());
        movies.forEach(System.out::println);
        System.out.println("**************************************************************");

        // Filtering
        movies.stream()
                .filter(movie -> movie.getIndustry().equals("Bollywood"))
                .forEach(System.out::println);
        System.out.println("**************************************************************");

        // Mapping
        movies.stream()
                .map(movie -> movie.getName())
                .forEach(System.out::println);
        System.out.println("**************************************************************");

        // Reducing
        movies.stream()
                .map(Movie::getName)
                .reduce((s, s2) -> s.concat(", " + s2))
                .ifPresent(System.out::println);


    }
}
