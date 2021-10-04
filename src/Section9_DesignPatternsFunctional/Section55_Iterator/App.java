package Section9_DesignPatternsFunctional.Section55_Iterator;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // Foreach example by manual
        MyArrayList list = new MyArrayList(new Object[]{1,3,5,67,8});
        list.forEach(System.out::println);

        // We already have this functionality it functional programming
        List<String> strList = List.of("Robust", "Productive", "Updated");
        strList.forEach(System.out::println);

    }
}
