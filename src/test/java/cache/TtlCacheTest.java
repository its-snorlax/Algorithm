package cache;

import org.junit.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TtlCacheTest {

    @Test
    public void shouldGetAndPutValue() {
        TtlCache ttlCache = new TtlCache(Duration.ofMillis(500));
        ttlCache.put(1, 1);
        ttlCache.put(2, 3);
        ttlCache.put(3, 4);

        assertEquals(3, ttlCache.get(2));
        assertEquals(1, ttlCache.get(1));
        assertEquals(4, ttlCache.get(3));
    }

    @Test
    public void shouldNotGetValuesWhenExpired() throws InterruptedException {
        TtlCache ttlCache = new TtlCache(Duration.ofMillis(500));
        ttlCache.put(1, 1);
        TimeUnit.SECONDS.sleep(1);
        assertEquals(0, ttlCache.get(1));
    }

    @Test
    public void shouldNotGetValueIfNeverInserted() {
        TtlCache ttlCache = new TtlCache(Duration.ofMillis(500));
        assertEquals(0, ttlCache.get(1));
    }
}