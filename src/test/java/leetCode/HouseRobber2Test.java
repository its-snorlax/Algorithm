package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobber2Test {
    @Test
    public void sample1() {
        int[] input = {2, 3, 2};
        assertEquals(3, new HouseRobber2().rob(input));
    }

    @Test
    public void sample2() {
        int[] input = {1, 2, 3, 1};
        assertEquals(4, new HouseRobber2().rob(input));
    }

    @Test
    public void sample3() {
        int[] input = {0};
        assertEquals(0, new HouseRobber2().rob(input));
    }

    @Test
    public void sample4() {
        int[] input = {1, 2};
        assertEquals(2, new HouseRobber2().rob(input));
    }

    @Test
    public void sample5() {
        int[] input = {200, 3, 140, 20, 10};
        assertEquals(340, new HouseRobber2().rob(input));
    }

    @Test
    public void sample6() {
        int[] input = {1, 3, 1, 3, 100};
        assertEquals(103, new HouseRobber2().rob(input));
    }
}