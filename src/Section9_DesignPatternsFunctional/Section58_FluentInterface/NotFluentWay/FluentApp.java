package Section9_DesignPatternsFunctional.Section58_FluentInterface.NotFluentWay;

public class FluentApp {
    public static void main(String[] args) {

        Order myOrder = new Order();
        myOrder.add("Shoes");
        myOrder.add("Headphones");

        myOrder.deliverAt("Street No 34, Center");
        myOrder.place();

    }
}
