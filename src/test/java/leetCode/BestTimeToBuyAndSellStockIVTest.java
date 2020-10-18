package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIVTest {
    @Test
    public void sample1() {
        int[] prices = {2, 4, 1};
        assertEquals(2, new BestTimeToBuyAndSellStockIV().maxProfit(2, prices));
    }

    @Test
    public void sample2() {
        int[] prices = {3, 2, 6, 5, 0, 3};
        assertEquals(7, new BestTimeToBuyAndSellStockIV().maxProfit(2, prices));
    }
}