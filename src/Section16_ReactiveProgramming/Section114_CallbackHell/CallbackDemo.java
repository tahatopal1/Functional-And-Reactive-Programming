package Section16_ReactiveProgramming.Section114_CallbackHell;

public class CallbackDemo {

    public static void main(String[] args) {

        System.out.println("Main thread is running...");

        Runnable r = () -> new CallbackDemo().
                runningAsync(() -> System.out.println("Callback 1 called!"));

        Thread t = new Thread(r);
        t.start();

        Runnable r2 = () -> new CallbackDemo().
                runningAsync(() -> System.out.println("Callback 2 called!"));

        Thread t2 = new Thread(r2);
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completed!");

    }

    public void runningAsync(Callback callback){
        System.out.println("I am running in separate thread.");
        sleep(10000);
        callback.call();
    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
