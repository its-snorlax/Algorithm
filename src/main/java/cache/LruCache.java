package cache;

import java.util.HashMap;
import java.util.LinkedList;

public class LruCache {

    private int Max_CAPACITY;
    private HashMap<Integer, Entry> hashMap;
    private LinkedList<Entry> linkedList;

    public LruCache(int size) {
        this.Max_CAPACITY = size;
        this.linkedList = new LinkedList<>();
        this.hashMap = new HashMap<>();
    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            Entry entry = hashMap.get(key);
            linkedList.remove(entry);
            linkedList.addFirst(entry);
            return entry.value;
        }
        return 0;
    }


    public void put(int key, int value) {
        if (linkedList.size() == Max_CAPACITY) {
            Entry entry = linkedList.removeLast();
            hashMap.remove(entry.key);
        }
        Entry newEntry = new Entry(key, value);
        linkedList.addFirst(newEntry);
        hashMap.put(key, newEntry);
    }

    class Entry {
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
