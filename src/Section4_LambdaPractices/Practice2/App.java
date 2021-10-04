package Section4_LambdaPractices.Practice2;

public class App {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> System.out.println(a+b);
        add.operation(5, 10);

        MathOperation sub = (a, b) -> System.out.println(a-b);
        sub.operation(10,5);

    }
}
