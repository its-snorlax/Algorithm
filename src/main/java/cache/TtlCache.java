package cache;

import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Optional;

public class TtlCache<K, V> {
    private final Duration cacheDuration;
    HashMap<K, Entry<V>> hashMap;

    public TtlCache(Duration cacheDuration) {
        this.cacheDuration = cacheDuration;
        this.hashMap = new HashMap<>();
    }

    public Optional<V> get(K id) {
        if (!hashMap.containsKey(id)) {
            return Optional.empty();
        }
        Entry<V> element = hashMap.get(id);
        long escapedTime = Calendar.getInstance().getTimeInMillis() - element.lastAccessedAt.getTimeInMillis();
        Duration escapeTimeDuration = Duration.ofMillis(escapedTime);
        if (escapeTimeDuration.compareTo(cacheDuration) > 0) {
            hashMap.remove(id);
            return Optional.empty();
        } else {
            return Optional.of(hashMap.get(id).value);
        }
    }

    public void put(K id, V value) {
        Entry<V> entry = new Entry<>(value);
        hashMap.put(id, entry);
    }

    static class Entry<V> {
        private V value;
        private Calendar lastAccessedAt;

        public Entry(V value) {
            this.value = value;
            this.lastAccessedAt = Calendar.getInstance();
        }
    }
}