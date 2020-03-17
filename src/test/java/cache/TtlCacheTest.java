package cache;

import org.junit.Test;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TtlCacheTest {

    @Test
    public void shouldGetAndPutValue() {
        TtlCache<Integer, Integer> ttlCache = new TtlCache<>(Duration.ofMillis(500));
        ttlCache.put(1, 1);
        ttlCache.put(2, 3);
        ttlCache.put(3, 4);

        assertEquals(new Integer(3), ttlCache.get(2).get());
        assertEquals(new Integer(1), ttlCache.get(1).get());
        assertEquals(new Integer(4), ttlCache.get(3).get());
    }

    @Test
    public void shouldReturnEmptyOptionalObjectWhileGetValuesWhenExpired() throws InterruptedException {
        TtlCache<Integer, Integer> ttlCache = new TtlCache<>(Duration.ofMillis(500));
        ttlCache.put(1, 1);
        TimeUnit.SECONDS.sleep(1);
        assertEquals(Optional.empty(), ttlCache.get(1));
    }

    @Test
    public void shouldReturnEmptyOptionalObjectWhenGetValueIfNeverInserted() {
        TtlCache<Integer, Integer> ttlCache = new TtlCache<>(Duration.ofMillis(500));
        assertFalse(ttlCache.get(1).isPresent());
    }

    @Test
    public void shouldReturnOptionalObjectWithValuePresentInItWhenDataIsGet() {
        TtlCache<Integer, Integer> ttlCache = new TtlCache<>(Duration.ofMillis(500));
        ttlCache.put(1, 1);
        assertTrue(ttlCache.get(1).isPresent());
    }
}