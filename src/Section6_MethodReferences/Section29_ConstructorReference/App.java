package Section6_MethodReferences.Section29_ConstructorReference;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
        Function<Runnable, Thread> threadGen = Thread :: new;

        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        Thread thread1 = threadGen.apply(task1);
        Thread thread2 = threadGen.apply(task2);

        thread1.start();
        thread2.start();
        threadGen.apply(() -> System.out.println("Task 3 executed"))
                    .start();

    }
}
