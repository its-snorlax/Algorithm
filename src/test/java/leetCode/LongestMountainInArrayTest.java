package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestMountainInArrayTest {
    @Test
    public void sample1() {
        assertEquals(5, new LongestMountainInArray().longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));
    }

    @Test
    public void sample2() {
        assertEquals(0, new LongestMountainInArray().longestMountain(new int[]{2, 2, 2}));
    }

    @Test
    public void sample3() {
        assertEquals(6, new LongestMountainInArray().longestMountain(new int[]{2, 1, 4, 7, 100, 3, 2, 5}));
    }

    @Test
    public void sample4() {
        assertEquals(11, new LongestMountainInArray().longestMountain(new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0}));
    }
}