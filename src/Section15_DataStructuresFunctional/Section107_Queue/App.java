package Section15_DataStructuresFunctional.Section107_Queue;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        QueueFun<String> q = QueueFun.queue();
        QueueFun<String> enqueue = q.enqueue("Hey")
                .enqueue("Hi")
                .enqueue("Hello")
                .enqueue("Welcome");

        enqueue.forEach(System.out::println);
        System.out.println("*******************");

        QueueFun<String> dequeue = enqueue.dequeue();
        dequeue.forEach(System.out::println);
        System.out.println("*******************");

        System.out.println("Peek: " + dequeue.peek());
        System.out.println("*******************");

        System.out.println("isEmpty: " + dequeue.isEmpty());
        System.out.println("*******************");

        System.out.println("size: " + dequeue.size());


    }
}
