package Section4_LambdaPractices.Practice3;

public class App {
    public static void main(String[] args) {
        LengthOfString len = s -> s.length();
        int length = len.length("Productivity");
        System.out.println("Length: " + length);
    }
}
