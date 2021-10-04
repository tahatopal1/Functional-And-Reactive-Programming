package Section3_LambdaAndFunctionalInterface.Section6_FunctionalInterface;

public class App {
    public static void main(String[] args) {

        MyFunInterface fun = () -> System.out.println("Hello mate!");
        fun.sampleMethod();

        onTheFly(() -> System.out.println("On the fly!"));

    }

    public static void onTheFly(MyFunInterface fun){
        fun.sampleMethod();
    }

}
