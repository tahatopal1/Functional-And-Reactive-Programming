package Section9_DesignPatternsFunctional.Section58_FluentInterface.FluentWay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order() { }

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order add(String item){
        cart.add(item);
        System.out.println(item + " added to the cart.");
        return new Order(this.cart, this.address);
    }

    public Order deliverAt(String location){
        this.address = location;
        System.out.println("The delivery address set by you is '" + location + "'");
        return new Order(this.cart, this.address);
    }

    public void place(){
        System.out.println("Order placed!");
        System.out.println(this.cart.size() + " items ordered by you will be delivered at " +
                this.address + "by tomorrow");
    }

    // We have produced a new method to be fluent even more
    public static void orderPlace(Function<Order, Order> function){
        Order order = new Order();
        order = function.apply(order);
        System.out.println("Order placed!");
        System.out.println(order.cart.size() + " items ordered by you will be delivered at " +
                 order.address + " by tomorrow.");
    }

}
