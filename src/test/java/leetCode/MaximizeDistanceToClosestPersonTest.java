package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximizeDistanceToClosestPersonTest {
    @Test
    public void sample1() {
        int[] input = {1, 0, 0, 0, 1, 0, 1};
        assertEquals(2, new MaximizeDistanceToClosestPerson().maxDistToClosest(input));
    }

    @Test
    public void sample2() {
        int[] input = {1, 0, 0, 0};
        assertEquals(3, new MaximizeDistanceToClosestPerson().maxDistToClosest(input));
    }

    @Test
    public void sample3() {
        int[] input = {0, 1};
        assertEquals(1, new MaximizeDistanceToClosestPerson().maxDistToClosest(input));
    }

    @Test
    public void sample4() {
        int[] input = {0, 0, 1, 0, 1, 1};
        assertEquals(2, new MaximizeDistanceToClosestPerson().maxDistToClosest(input));
    }

    @Test
    public void sample5() {
        int[] input = {0, 1, 1, 1, 0, 0, 1, 0, 0};
        assertEquals(2, new MaximizeDistanceToClosestPerson().maxDistToClosest(input));
    }


}