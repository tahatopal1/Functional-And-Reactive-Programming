package Section12_Collectors.Section92_CascadingCollectors;

import Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1.Employee;
import Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1.EmployeeSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\tahat\\Functional-And-Reactive-Programming\\src\\Section12_Collectors\\Section88_TerminalAnalogousCollectors\\Part_1\\EmployeeData");
        try(Stream<String> lines = Files.lines(path);){
            Stream<String> words = lines.flatMap(s -> Arrays.stream(s.split(",")));
            Spliterator<String> wordSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            // We the Collectors are used
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeeList = employees.collect(Collectors.toList());

            // Cascading with grouping
            Map<String, Long> countByDesignation = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting()));
            System.out.println(countByDesignation);

            Map<String, Double> sumByDesignation = employeeList.stream()
                    .collect(Collectors.groupingBy
                            (Employee::getDesignation, Collectors.summingDouble(Employee::getSalary)));
            System.out.println(sumByDesignation);

            Map<String, Optional<Employee>> maxSalaryEmployeeByDesignation = employeeList.stream().collect(
                    Collectors.groupingBy
                            (Employee::getDesignation, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
            System.out.println(maxSalaryEmployeeByDesignation);


            Map<String, Optional<Double>> maxSalaryByDesignation = employeeList.stream().collect(
                    Collectors.groupingBy(
                            Employee::getDesignation, Collectors.mapping(
                                    Employee::getSalary, Collectors.maxBy(Comparator.comparing(Function.identity())))));
            System.out.println(maxSalaryByDesignation);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
