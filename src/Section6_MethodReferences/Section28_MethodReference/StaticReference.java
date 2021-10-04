package Section6_MethodReferences.Section28_MethodReference;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StaticReference {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = A_class :: methodStatic;
        System.out.println(binaryOperator.apply("Robust ", "Development"));
    }
}

class A_class{
    static String methodStatic(String a, String b){
        return a.concat(b);
    }
}
