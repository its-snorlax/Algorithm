package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SellDiminishingValuedColoredBallsTest {
    @Test
    public void sample1() {
        int[] inventory = {2, 5};
        int i = new SellDiminishingValuedColoredBalls().maxProfit(inventory, 4);

        assertEquals(14, i);
    }

    @Test
    public void sample2() {
        int[] inventory = {2,8,4,10,6};
        int i = new SellDiminishingValuedColoredBalls().maxProfit(inventory, 20);

        assertEquals(110, i);
    }

    @Test
    public void sample3() {
        int[] inventory = {1000000000};
        int i = new SellDiminishingValuedColoredBalls().maxProfit(inventory, 1000000000);

        assertEquals(21, i);
    }
}