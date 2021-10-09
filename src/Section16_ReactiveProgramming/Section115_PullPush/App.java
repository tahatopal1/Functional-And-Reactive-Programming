package Section16_ReactiveProgramming.Section115_PullPush;


public class App {
    public static void main(String[] args) {

        System.out.println("Main thread is running...");

        Runnable r = () -> new App().runningAsync(new CallBack() {
            @Override
            public void pushData(String data) {
                System.out.println("Callback data: " + data);
            }

            @Override
            public void pushComplete() {
                System.out.println("Callback completed!");
            }

            @Override
            public void pushError(Exception e) {
                System.out.println("Callback error called, got an exception: " + e);
            }
        });

        Thread t = new Thread(r);
        t.start();

        System.out.println("Main thread completed!");


    }

    public void runningAsync(CallBack callback){

        System.out.println("I am running in separate thread.");
        sleep(10000);

        callback.pushData("Data 1");
        callback.pushData("Data 2");
        callback.pushData("Data 3");

        callback.pushError(new RuntimeException("Oops!"));
        callback.pushComplete();

    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
