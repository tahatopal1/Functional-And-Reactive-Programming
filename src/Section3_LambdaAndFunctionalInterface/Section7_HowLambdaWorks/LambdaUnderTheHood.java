package Section3_LambdaAndFunctionalInterface.Section7_HowLambdaWorks;

import Section3_LambdaAndFunctionalInterface.Section6_FunctionalInterface.MyFunInterface;

public class LambdaUnderTheHood {
    public static void main(String[] args) {

        // When we use these definitions, .class files will be generated
        /*MyFunInterface fun = new MyFunInterface() {
            @Override
            public void sampleMethod() {
                System.out.println("Implementation 1");
            }
        };

        MyFunInterface fun2 = new MyFunInterface() {
            @Override
            public void sampleMethod() {
                System.out.println("Implementation 2");
            }
        };*/

        // We use this definition instead for simplicity and performance
        MyFunInterface fun3 = () -> System.out.println("Implementation 3");

    }
}
