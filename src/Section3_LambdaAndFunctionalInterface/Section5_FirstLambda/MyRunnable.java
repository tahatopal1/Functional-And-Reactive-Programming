package Section3_LambdaAndFunctionalInterface.Section5_FirstLambda;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread executed!");
    }
}
