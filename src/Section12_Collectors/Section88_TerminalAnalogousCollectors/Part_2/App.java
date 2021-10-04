package Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_2;

import Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1.Employee;
import Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1.EmployeeSpliterator;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
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

            // Collectors are used
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeeList = employees.collect(Collectors.toList());

            TreeSet<Employee> sortedEmployees = employeeList.stream()
                    .collect(Collectors.toCollection(TreeSet::new));
                    //.collect(Collectors.toCollection(() -> new TreeSet<Employee>(Comparator.comparing(Employee::getSalary))));

            sortedEmployees.forEach(System.out::println);

            System.out.println("***************************");

            // Collecting to a map
            Map<Integer, String> getNameByIdMap =
                    employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
            System.out.println(getNameByIdMap);

            System.out.println("***************************");

            // Partitioning (Divide into only 2 groups according to satisfying the case
            Map<Boolean, List<Employee>> partitionedData
                    = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getGender() == 'M'));
            System.out.println(partitionedData);

            System.out.println("***************************");

            List<Employee> maleEmployees = partitionedData.get(true);
            List<Employee> femaleEmployees = partitionedData.get(false);

            System.out.println("Male Employees: " + maleEmployees);
            System.out.println("Female Emplyoees: " + femaleEmployees);

            System.out.println("***************************");

            // Grouping (Divide into multiple groups according to a property which is actually a classifier
            Map<String, List<Employee>> groupedData = employeeList.stream()
                    .collect(Collectors.groupingBy(employee -> employee.getDesignation()));
            System.out.println(groupedData);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
