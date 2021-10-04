package Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsApp {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\tahat\\Functional-And-Reactive-Programming\\src\\Section12_Collectors\\Section88_TerminalAnalogousCollectors\\Part_1\\EmployeeData");
        try(Stream<String> lines = Files.lines(path);){
            Stream<String> words = lines.flatMap(s -> Arrays.stream(s.split(",")));
            Spliterator<String> wordSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            // Collectors are used
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeeList = employees.collect(Collectors.toList());

            List<String> employeeNames
                    = employeeList.stream().map(employee -> employee.getName()).collect(Collectors.toList());
            employeeNames.forEach(System.out::println);
            System.out.println("*******************************************");
            Set<String> designations = employeeList.stream().map(Employee::getDesignation).collect(Collectors.toSet());
            designations.forEach(System.out::println);


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
