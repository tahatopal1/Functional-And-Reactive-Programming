package Section8_FunctionalInDepth.Section42_PureFunctions;

public class App {
    public static void main(String[] args) {

        // logs and returns a value
        int result = add(multiply(2,3), multiply(3,4));
        System.out.println(result);

        // do not log and only return a value
        result = add(6,  12);
        System.out.println(result);

        // Just because there is no more logging anymore, the result of function is different now.
        // So, multiply function is not a pure function (Side effects)
        // Printing something to console is considered as a "Side effect"

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        log(String.format("Returning %s as the result of %s * %s", (a * b), a, b));
        return a * b;
    }

    // log function is not a pure function either.
    // It returns nothing.
    public static void log(String m){
        System.out.println(m);
    }

}


