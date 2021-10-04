package Section9_DesignPatternsFunctional.Section58_FluentInterface.FluentWay;


public class FluentApp {
    public static void main(String[] args) {

        // We made this code more fluent by using method chaining
        new Order()
                .add("Shoes")
                .add("Headphones")
                .deliverAt("Street No 34, Center")
                .place();


        System.out.println("----------------------------------");

        // Being fluent even more
        Order.orderPlace(order -> order.add("Shoes")
                .add("Headphone")
                .deliverAt("Street No 45 Center"));

    }
}
