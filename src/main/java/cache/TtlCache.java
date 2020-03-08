package cache;

import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;

public class TtlCache {
    private final Duration cacheDuration;
    HashMap<Integer, Entry> hashMap;

    public TtlCache(Duration duration) {
        cacheDuration = duration;
        this.hashMap = new HashMap<>();
    }

    public int get(int id) {
        if (!hashMap.containsKey(id)) {
            return 0;
        }
        Entry element = hashMap.get(id);
        long escapedTime = Calendar.getInstance().getTimeInMillis() - element.lastAccessedAt.getTimeInMillis();
        Duration escapeTimeDuration = Duration.ofMillis(escapedTime);
        if (escapeTimeDuration.compareTo(cacheDuration) > 0) {
            hashMap.remove(id);
            return 0;
        } else {
            return hashMap.get(id).value;
        }
    }

    public void put(int id, int value) {
        Entry entry = new Entry(value);
        hashMap.put(id, entry);
    }

    static class Entry {
        int value;
        Calendar lastAccessedAt;

        public Entry(int value) {
            this.value = value;
            this.lastAccessedAt = Calendar.getInstance();
        }
    }
}