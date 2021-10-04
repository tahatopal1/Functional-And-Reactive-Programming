package Section10_Streams.Section77_ParallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        long startTime;
        long endTime;

        List<Employee> list = new ArrayList<>();
        Stream.iterate(0, i -> ++i)
                .limit(100)
                .forEach(integer -> {
                    list.add(new Employee("John", 20000));
                    list.add(new Employee("Jack", 3000));
                    list.add(new Employee("Tom", 15000));
                    list.add(new Employee("Steve", 200));
                    list.add(new Employee("Clark", 50000));
                });

        timeCalculation(list, true);
        timeCalculation(list, false);
    }

    private static void timeCalculation(List<Employee> list, boolean isParallel) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        if (!isParallel){
            System.out.print("Performing sequentially: ");
            Optional.ofNullable(
                    list.stream().filter(employee -> employee.getSalary() > 1000).count())
                    .ifPresent(System.out::println);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken with sequential: " + (endTime - startTime));
        }else{
            System.out.print("Performing parallelly: ");
            Optional.ofNullable(
                    list.stream()
                    .parallel()
                    .filter(employee -> employee.getSalary() > 1000).count())
                    .ifPresent(System.out::println);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken with parallel: " + (endTime - startTime));

        }


    }
}
