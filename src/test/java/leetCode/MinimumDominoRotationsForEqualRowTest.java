package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDominoRotationsForEqualRowTest {

    @Test
    public void sample1() {
        int[] a = new int[]{2, 1, 2, 4, 2, 2};
        int[] b = new int[]{5, 2, 6, 2, 3, 2};
        assertEquals(2, new MinimumDominoRotationsForEqualRow().minDominoRotations(a, b));
    }

    @Test
    public void sample2() {
        int[] a = new int[]{3, 5, 1, 2, 3};
        int[] b = new int[]{3, 6, 3, 3, 4};
        assertEquals(-1, new MinimumDominoRotationsForEqualRow().minDominoRotations(a, b));
    }
}