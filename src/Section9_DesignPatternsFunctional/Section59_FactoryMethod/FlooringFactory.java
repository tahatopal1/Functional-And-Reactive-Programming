package Section9_DesignPatternsFunctional.Section59_FactoryMethod;

import java.util.function.Supplier;

public class FlooringFactory {
    public static Flooring getFlooring(int minTemp, int maxTemp){

        Supplier<Flooring> flooring;
        if (minTemp <= 5 && maxTemp <= 20)
            flooring = () -> new WoodenFlooring();
        else if (minTemp <= 5 && maxTemp >= 45)
            flooring = () -> new CorkFlooring();
        else
            flooring = () -> new ConcreteFlooring();

        return flooring.get();

    }
}
