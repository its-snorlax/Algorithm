package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIIITest {
    @Test
    public void sample1() {
        int[] input = {3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals(6, new BestTimeToBuyAndSellStockIII().maxProfit(input));
    }

    @Test
    public void sample2() {
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(4, new BestTimeToBuyAndSellStockIII().maxProfit(input));
    }

    @Test
    public void sample3() {
        int[] input = {7, 6, 4, 3, 1};
        assertEquals(0, new BestTimeToBuyAndSellStockIII().maxProfit(input));
    }

    @Test
    public void sample4() {
        int[] input = {1};
        assertEquals(0, new BestTimeToBuyAndSellStockIII().maxProfit(input));
    }
}