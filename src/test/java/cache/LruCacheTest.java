package cache;

import org.junit.Test;

import static org.junit.Assert.*;

public class LruCacheTest {

    @Test
    public void shouldCheckElementIsPresentOrNotWhenCacheSizeIsExceeded() {
        LruCache<Integer, Integer> lruCache = new LruCache<>(4);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 4);
        lruCache.put(4, 6);
        lruCache.put(6, 10);

        assertTrue(lruCache.get(2).isPresent());
        assertFalse(lruCache.get(1).isPresent());
        assertTrue(lruCache.get(3).isPresent());
        assertTrue(lruCache.get(4).isPresent());
        assertTrue(lruCache.get(6).isPresent());
    }

    @Test
    public void shouldMarkElementFreshWhenAccessed() {
        LruCache<Integer, Integer> lruCache = new LruCache<>(4);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 4);
        lruCache.put(4, 6);
        lruCache.get(1);
        lruCache.put(6, 10);

        assertFalse(lruCache.get(2).isPresent());
        assertTrue(lruCache.get(1).isPresent());
        assertTrue(lruCache.get(3).isPresent());
        assertTrue(lruCache.get(4).isPresent());
        assertTrue(lruCache.get(6).isPresent());
    }

    @Test
    public void shouldCheckWeAccessedTheCorrectValue() {
        LruCache<Integer, Integer> lruCache = new LruCache<>(4);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 4);
        lruCache.put(4, 6);

        assertEquals(new Integer(1),lruCache.get(1).get());
        assertEquals(new Integer(3),lruCache.get(2).get());
        assertEquals(new Integer(4),lruCache.get(3).get());
        assertEquals(new Integer(6),lruCache.get(4).get());
    }
}