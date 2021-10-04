package Section4_LambdaPractices.Practice1;

public class App {
    public static void main(String[] args) {
        Name name = () -> System.out.println("John");
        name.myName();
    }
}
