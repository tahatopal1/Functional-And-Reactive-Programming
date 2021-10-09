package Section15_DataStructuresFunctional.Section109_Map;

public class MapFun <K,V>{

    private EntryFun[] entries;
    private int size;

    public MapFun(int size) {
        this.size = size;
        this.entries = new EntryFun[size];

        for (EntryFun entry : this.entries) {
            entry = new EntryFun();
        }

    }

    public MapFun(EntryFun[] entries, int size) {
        this.size = size;
        this.entries = entries;
    }

    // For hashing
    public Integer getHash(K key){
        return key.hashCode() % size;
    }

    public MapFun<K,V> put(K key, V value){

        int hash = getHash(key);
        EntryFun existingEntry = entries[hash];

        if (isDuplicated(key))
            existingEntry.value = value;

        EntryFun neuEntry = new EntryFun(key, value);
        entries[hash] = neuEntry;
        neuEntry.next = existingEntry;
        return new MapFun<K,V>(entries, size);
    }

    private boolean isDuplicated(K key) {
        EntryFun entry = entries[getHash(key)];
        while (entry != null){
            if (key.equals(entry.key))
                return true;
            entry = entry.next;
        }
        return false;
    }

    public V getValue(K key){

        V val = null;
        int hash = getHash(key);
        EntryFun entry = entries[hash];

        while (entry.next != null){

            if (key.equals(entry.getKey())){
                val = (V) entry.getValue();
                break;
            }

            entry = entry.next;
        }

        return val;

    }

    public void display() {
        for (int i = 0; i < this.entries.length; i++){
            System.out.println(this.entries[i]);
        }
    }

}
