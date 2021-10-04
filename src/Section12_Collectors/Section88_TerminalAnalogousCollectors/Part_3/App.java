package Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_3;

import Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1.Employee;
import Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1.EmployeeSpliterator;

import java.io.IOException;
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

            // We the Collectors are used
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeeList = employees.collect(Collectors.toList());

            // Joining
            String strByJoining = employeeList.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(","));
            System.out.println(strByJoining);

            System.out.println("***************************");

            // Counting
            Long counted = employeeList.stream()
                    .map(Employee::getDesignation)
                    .collect(Collectors.counting());
            System.out.println(counted);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
