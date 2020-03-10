package cache;

import org.junit.Test;

import static org.junit.Assert.*;

public class LruCacheTest {

    @Test
    public void shouldRemoveTheOldestValueWhenCacheSizeIsExceeded() {
        LruCache lruCache = new LruCache(4);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 4);
        lruCache.put(4, 6);
        lruCache.put(6, 10);

        assertEquals(3, lruCache.get(2));
        assertEquals(0, lruCache.get(1));
        assertEquals(4, lruCache.get(3));
        assertEquals(6, lruCache.get(4));
        assertEquals(10, lruCache.get(6));
    }

    @Test
    public void shouldMarkElementFreshWhenAccessed() {
        LruCache lruCache = new LruCache(4);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 4);
        lruCache.put(4, 6);
        lruCache.get(1);
        lruCache.put(6, 10);

        assertEquals(0, lruCache.get(2));
        assertEquals(1, lruCache.get(1));
        assertEquals(4, lruCache.get(3));
        assertEquals(6, lruCache.get(4));
        assertEquals(10, lruCache.get(6));
    }

}

// Check whether an element is marked fresh when accessing it from cache
//