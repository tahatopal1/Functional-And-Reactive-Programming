package Section5_FunctionalInterfaces.Section18_GenericFunctionalInterface;

public class App {
    public static void main(String[] args) {

        GenericFunctional<String, String> fun = s -> s.substring(0,7);
        String productivity = fun.execute("Productivity");
        System.out.println(productivity);

        GenericFunctional<String, Integer> fun2 = s -> s.length();
        int brilliant = fun2.execute("Brilliant");
        System.out.println("Len: " + brilliant);

    }
}
