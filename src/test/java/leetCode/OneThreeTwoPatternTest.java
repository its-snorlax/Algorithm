package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneThreeTwoPatternTest {
    @Test
    public void sample1() {
        int[] input = {1, 2, 3, 4};
        assertFalse(new OneThreeTwoPattern().find132pattern(input));
    }

    @Test
    public void sample2() {
        int[] input = {3, 1, 4, 2};
        assertTrue(new OneThreeTwoPattern().find132pattern(input));
    }

    @Test
    public void sample3() {
        int[] input = {-1, 3, 2, 0};
        assertTrue(new OneThreeTwoPattern().find132pattern(input));
    }

    @Test
    public void sample4() {
        int[] input = {1, 0, 1, -4, -3};
        assertFalse(new OneThreeTwoPattern().find132pattern(input));
    }
}