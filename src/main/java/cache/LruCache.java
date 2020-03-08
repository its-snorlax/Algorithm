package cache;

import java.util.HashMap;
import java.util.LinkedList;

public class LruCache {

    int Max_CAPACITY;
    HashMap<Integer, Entry> hashMap;
    private LinkedList<Entry> linkedList;

    public LruCache(int size) {
        this.Max_CAPACITY = size;
        this.linkedList = new LinkedList<>();
        this.hashMap = new HashMap<>();
    }

    private int get(int key) {
        if (hashMap.containsKey(key)) {
            Entry entry = hashMap.get(key);
            linkedList.remove(entry);
            linkedList.addFirst(entry);
            return entry.value;
        }
        return 0;
    }


    private void put(int key, int value) {
        if (linkedList.size() == Max_CAPACITY) {
            Entry entry = linkedList.removeLast();
            hashMap.remove(entry.key);
        }
        Entry newEntry = new Entry(key, value);
        linkedList.addFirst(newEntry);
        hashMap.put(key, newEntry);
    }


    public static void main(String[] args) {
        LruCache lruCache = new LruCache(5);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 4);
        lruCache.put(4, 6);
        lruCache.put(6, 10);
        if (lruCache.get(1) == 0) System.out.println("Key Not Found");
        if (lruCache.get(3) == 0) System.out.println("Key Not Found");
        lruCache.put(1, 5);
        lruCache.put(12, 7);
        lruCache.put(5, 2);
        if (lruCache.get(4) == 0) System.out.println("Key Not Found");
    }

    static class Entry {
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
