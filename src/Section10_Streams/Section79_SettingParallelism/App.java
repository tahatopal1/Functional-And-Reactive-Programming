package Section10_Streams.Section79_SettingParallelism;

import Section10_Streams.Section77_ParallelStreams.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(Runtime.getRuntime().availableProcessors()); // 12
        System.out.println(ForkJoinPool.getCommonPoolParallelism()); // 11, 1 is always busy for main method

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");
        System.out.println(ForkJoinPool.getCommonPoolParallelism()); // 10 (2 are busy)

        ForkJoinPool pool = new ForkJoinPool(2); // Custom join pool
        System.out.println(pool.getCommonPoolParallelism());

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 100; i++){ // 600 employees
            list.add(new Employee("John", 20000));
            list.add(new Employee("Jack", 3000));
            list.add(new Employee("Tom", 15000));
            list.add(new Employee("Steve", 200));
            list.add(new Employee("Clark", 50000));
        }

        Long result = pool.submit(() -> list.parallelStream().filter(e -> e.getSalary() > 1000).count()).get();
        Optional.ofNullable(result).ifPresent(System.out::println);


    }
}
