package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class KDiffPairsTest {
    @Test
    public void sampleInput1() {
        assertEquals(2, new KDiffPairs().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void sampleInput2() {
        assertEquals(4, new KDiffPairs().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void sampleInput3() {
        assertEquals(1, new KDiffPairs().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void sampleInput4() {
        assertEquals(2, new KDiffPairs().findPairs(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3));
    }

    @Test
    public void sampleInput5() {
        assertEquals(2, new KDiffPairs().findPairs(new int[]{-1, -2, -3}, 1));
    }

}