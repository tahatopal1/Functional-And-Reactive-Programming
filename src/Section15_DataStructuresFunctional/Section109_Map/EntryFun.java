package Section15_DataStructuresFunctional.Section109_Map;

public class EntryFun {

    Object key;
    Object value;

    // Solution for collision
    EntryFun next;

    public EntryFun(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public EntryFun() {
        this.next = null;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public EntryFun getNext() {
        return next;
    }

    public void setNext(EntryFun next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "EntryFun{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
