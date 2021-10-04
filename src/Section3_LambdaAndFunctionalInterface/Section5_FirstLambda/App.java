package Section3_LambdaAndFunctionalInterface.Section5_FirstLambda;

public class App {
    public static void main(String[] args) {

        // Defining with a class implements runnable
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();

        // To be concise as using thread by using anonymous object
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread executed with anonymous object.");
            }
        });
        t.start();

        // To be even more concise by using lambda
        // Remove function name
        // Remove return type
        // Remove function body
        t = new Thread(() -> {
            System.out.println("Thread executed with lambda.");
        });
        t.start();

    }
}
