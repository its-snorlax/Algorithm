package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourSumIITest {
    @Test
    public void sample1() {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{-2, -1};
        int[] num3 = new int[]{-1, 2};
        int[] num4 = new int[]{0, 2};

        assertEquals(2, new FourSumII().fourSumCount(num1, num2, num3, num4));
    }
}