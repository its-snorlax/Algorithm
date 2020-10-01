package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecentCounterTest {
    @Test
    public void sampleTest() {
        RecentCounter recentCounter = new RecentCounter();
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));

    }
}
