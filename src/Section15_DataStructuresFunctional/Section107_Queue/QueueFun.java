package Section15_DataStructuresFunctional.Section107_Queue;

import Section15_DataStructuresFunctional.Section106_List.ListFun;

import java.util.function.Consumer;

public final class QueueFun<T> {

    public final ListFun<T> front;
    public final ListFun<T> rear;

    private QueueFun() {
        this.front = ListFun.list();
        this.rear = ListFun.list();
    }

    // Empty queue
    public static <T> QueueFun<T> queue(){
        return new QueueFun<T>();
    }

    private QueueFun(QueueFun<T> queue, T element){
        boolean frontIsEmpty = queue.front.isEmpty();
        this.front = frontIsEmpty ? queue.front.addElement(element) : queue.front;
        this.rear = frontIsEmpty ? queue.rear : queue.rear.addElement(element);
    }

    // Enqueue
    public QueueFun<T> enqueue(T t){
        return new QueueFun<T>(this, t);
    }

    private QueueFun(ListFun<T> front, ListFun<T> rear){
        final boolean frontIsEmpty = front.isEmpty();
        this.front = frontIsEmpty ? rear.reverseList() : front;
        this.rear = frontIsEmpty ? front : rear;
    }

    // Dequeue
    public QueueFun<T> dequeue(){
        return new QueueFun<T>(this.front.tail(), rear);
    }

    void forEach(Consumer<? super T> action){
        T current = this.front.head();
        ListFun<T> temp = ListFun.concatList(this.front.tail(), this.rear.reverseList());
        while (temp != null){
            action.accept(current);
            current = temp.head();
            temp = temp.tail();
        }
    }

    public int size(){
        return front.length() + rear.length();
    }

    public T peek(){
        return  (size() == 0) ? null : this.front.head();
    }

    public boolean isEmpty(){
        return this.front.isEmpty() == this.rear.isEmpty() == true;
    }

}
