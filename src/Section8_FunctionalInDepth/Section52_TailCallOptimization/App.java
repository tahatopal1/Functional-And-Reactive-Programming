package Section8_FunctionalInDepth.Section52_TailCallOptimization;

public class App {
    public static void main(String[] args) {

    }

    // Regular recursion
    public static long reFact(int n){
        if (n <= 1)
            return 1;
        else
            return n * reFact(n-1);
    }

    // Tail recursion
    public static long tailReFact(int n, int a){
        if (n <= 1)
            return a;
        else
            return tailReFact(n-1, n * a);
    }

}
