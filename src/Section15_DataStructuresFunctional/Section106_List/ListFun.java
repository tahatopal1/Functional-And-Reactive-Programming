package Section15_DataStructuresFunctional.Section106_List;

import java.util.Collection;
import java.util.function.Consumer;

public abstract class ListFun<T> {

    public abstract T head();

    public abstract ListFun<T> tail();


    public abstract boolean isEmpty();

    @SuppressWarnings("rawtypes")
    public static final ListFun NIL = new Nil();

    private static class Nil<T> extends ListFun<T>{

        private Nil(){

        }

        @Override
        public T head() {
            return null;
        }

        @Override
        public ListFun<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    public int length(){

        int l = 0;

        ListFun<T> temp = this;
        while (!temp.equals(NIL)){
            l++;
            temp = temp.tail();
        }

        return l;
    }

    private static class Const<T> extends ListFun<T>{

        private final T head;
        private final ListFun<T> tail;

        public Const(T head, ListFun<T> tail) {
            this.head = head;
            this.tail = tail;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public ListFun<T> tail() {
            return tail;
        }

        @Override
        public boolean isEmpty() {
            return length() == 0 ? true : false;
        }

    }

    public static <T> ListFun<T> list(){
        return NIL;
    }

    public static <T> ListFun<T> list(T...t){
        ListFun<T> temp = list();
        for (int i = t.length-1; i >= 0; i--){
            temp = new Const<T>(t[i], temp);
        }
        return temp;
    }

    public ListFun<T> addElement(T t){
        return new Const<T>(t, this);
    }

    public void forEach(Consumer<? super T> action){

        T current = this.head();
        ListFun<T> temp = this;

        for (int i = 0; i < length(); i++){
            action.accept(current);
            temp = temp.tail();
            current = temp.head();
        }

    }

    public ListFun<T> removeElement(T element){
        if (this.length() == 0)
            return this;
        else if (element.equals(this.head()))
            return tail();
        else{
            ListFun<T> nTail = tail().removeElement(element);
            return new Const<T>(head(), nTail);
        }
    }

    public ListFun<T> reverseList(){

        ListFun<T> list = list();
        T current = this.head();
        ListFun<T> temp = this;

        while (!temp.equals(NIL)){
            list = list.addElement(current);
            temp = temp.tail();
            current = temp.head();
        }

        return list;
    }

    public static <T> ListFun<T> concatList(ListFun<T> list1, ListFun<T> list2){
        return list1.isEmpty()
                ? list2
                : new Const<>(list1.head(), concatList(list1.tail(), list2));
    }

    public ListFun<T> addAllEle(final Collection<? extends T> list){
        ListFun<T> result = this;
        for (T t: list){
            result = result.addElement(t);
        }
        return result;
    }


}
