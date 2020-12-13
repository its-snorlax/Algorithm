package leetCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurstBalloonsTest {
    @Test
    public void sample1() {
        int[] inputs = new int[]{3, 1, 5, 8};
        int actualOutput = new BurstBalloons().maxCoins(inputs);
        assertEquals(167, actualOutput);
    }
}
