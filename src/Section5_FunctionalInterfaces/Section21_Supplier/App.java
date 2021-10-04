package Section5_FunctionalInterfaces.Section21_Supplier;

import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        Supplier<String> strSup = () -> new String("Supplied string");
        System.out.println(strSup.get());

        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());

    }
}
