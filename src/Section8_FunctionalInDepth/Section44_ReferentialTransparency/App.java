package Section8_FunctionalInDepth.Section44_ReferentialTransparency;

public class App {

    public static void main(String[] args) {

        // Transparent example
        System.out.println("********* TRANSPARENT EXAMPLE *********");
        int result = add(2, multiply(2, 4));
        int result1 = add(2, multiply(2, multiply(2,2)));
        // In this situation, result won't change

        // Non-transparent example
        System.out.println("********* TRANSPARENT EXAMPLE *********");
        result = add(2, multiplyNonTransparent(2, 4));
        result1 = add(2, multiplyNonTransparent(2, multiplyNonTransparent(2,2)));
        // Result will change because different sentences will be printed
        // So, multiplyNonTransparent is a non-transparent function
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int multiplyNonTransparent(int a, int b){
        return a*b;
    }

}
