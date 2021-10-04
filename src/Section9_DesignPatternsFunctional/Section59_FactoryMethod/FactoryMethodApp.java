package Section9_DesignPatternsFunctional.Section59_FactoryMethod;

public class FactoryMethodApp {
    public static void main(String[] args) {

        Flooring floor = FlooringFactory.getFlooring(-1, 18);
        floor.installation();
        System.out.println();
    }
}
