package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestRangeIITest {
    @Test
    public void sample1() {
        assertEquals(0, new SmallestRangeII().smallestRangeII(new int[]{1}, 0));
    }

    @Test
    public void sample2() {
        assertEquals(6, new SmallestRangeII().smallestRangeII(new int[]{0, 10}, 2));
    }

    @Test
    public void sample3() {
        assertEquals(3, new SmallestRangeII().smallestRangeII(new int[]{1, 3, 6}, 3));
    }

    @Test
    public void sample4() {
        assertEquals(1, new SmallestRangeII().smallestRangeII(new int[]{7, 8, 8}, 5));
    }

    @Test
    public void sample5() {
        assertEquals(2, new SmallestRangeII().smallestRangeII(new int[]{3, 1, 10}, 4));
    }
}