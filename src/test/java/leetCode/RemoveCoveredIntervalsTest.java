package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveCoveredIntervalsTest {
    @Test
    public void sampleTest1() {
        int[][] input = new int[][]{{1, 4}, {3, 6}, {2, 8}};
        assertEquals(2, new RemoveCoveredIntervals().removeCoveredIntervals(input));
    }

    @Test
    public void sampleTest2() {
        int[][] input = new int[][]{{1, 4}, {2, 3}};
        assertEquals(1, new RemoveCoveredIntervals().removeCoveredIntervals(input));
    }

    @Test
    public void sampleTest3() {
        int[][] input = new int[][]{{0, 10}, {5, 12}};
        assertEquals(2, new RemoveCoveredIntervals().removeCoveredIntervals(input));
    }

    @Test
    public void sampleTest4() {
        int[][] input = new int[][]{{3, 10}, {4, 10}, {5, 11}};
        assertEquals(2, new RemoveCoveredIntervals().removeCoveredIntervals(input));
    }

    @Test
    public void sampleTest5() {
        int[][] input = new int[][]{{1, 2}, {1, 4}, {3, 4}};
        assertEquals(1, new RemoveCoveredIntervals().removeCoveredIntervals(input));
    }
}