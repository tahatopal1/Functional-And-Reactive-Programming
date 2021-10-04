package Section9_DesignPatternsFunctional.Section57_Decorator;

public class Burger {

    private String burgerType;

    public Burger(){
        this.burgerType = "";
    }

    private Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addVeggies(){
        System.out.println("Adding veggies to the burger.");
        return new Burger(this.burgerType += " Veggie");
    }

    public Burger addCheese(){
        System.out.println("Adding cheese to the burger.");
        return new Burger(this.burgerType += " Cheese");
    }

    @Override
    public String toString() {
        return burgerType + " burger";
    }
}
