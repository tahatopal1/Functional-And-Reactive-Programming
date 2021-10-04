package Section9_DesignPatternsFunctional.Section57_Decorator;

import java.util.function.Function;

public class BurgerShop {

    Function<Burger, Burger> decoration;

    public Burger use(Burger baseBurger) {
        System.out.println("Base Burger: " + baseBurger);
        return decoration.apply(baseBurger);
    }

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }
}
