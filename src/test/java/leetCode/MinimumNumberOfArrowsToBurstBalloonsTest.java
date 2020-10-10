package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNumberOfArrowsToBurstBalloonsTest {
    @Test
    public void sample1() {
        int[][] input = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }

    @Test
    public void sample2() {
        int[][] input = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertEquals(4, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }

    @Test
    public void sample3() {
        int[][] input = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }

    @Test
    public void sample4() {
        int[][] input = new int[][]{{1, 2}};
        assertEquals(1, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }

    @Test
    public void sample5() {
        int[][] input = new int[][]{{2, 3}, {2, 3}};
        assertEquals(1, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }

    @Test
    public void sample6() {
        int[][] input = new int[][]{{-2147483646,-2147483645},{2147483646,2147483647}};
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }
}