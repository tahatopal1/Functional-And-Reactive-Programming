package Section9_DesignPatternsFunctional.Section57_Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        Burger myOrder = new BurgerShop(burger -> burger.addVeggies()).use(new Burger());
        System.out.println(myOrder);
        new BurgerShop(burger -> burger.addCheese()).use(myOrder);
        System.out.println(myOrder);
    }
}
