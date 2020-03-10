package cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Optional;

public class LruCache<K, V> {

    private int Max_CAPACITY;
    private HashMap<K, Entry<K, V>> hashMap;
    private LinkedList<Entry<K, V>> linkedList;

    public LruCache(int size) {
        this.Max_CAPACITY = size;
        this.linkedList = new LinkedList<>();
        this.hashMap = new HashMap<>();
    }

    public Optional<V> get(K key) {
        if (hashMap.containsKey(key)) {
            Entry<K,V> entry = hashMap.get(key);
            linkedList.remove(entry);
            linkedList.addFirst(entry);
            return Optional.of(entry.value);
        }
        return Optional.empty();
    }


    public void put(K key, V value) {
        if (linkedList.size() == Max_CAPACITY) {
            Entry<K,V> entry = linkedList.removeLast();
            hashMap.remove(entry.key);
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        linkedList.addFirst(newEntry);
        hashMap.put(key, newEntry);
    }

    static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
