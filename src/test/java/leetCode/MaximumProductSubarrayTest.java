package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductSubarrayTest {
    @Test
    public void sample1() {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        assertEquals(6, maximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void sample2() {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        assertEquals(0, maximumProductSubarray.maxProduct(new int[]{-2, 0, -1}));
    }

    @Test
    public void sample3() {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        assertEquals(24, maximumProductSubarray.maxProduct(new int[]{2, -5, -2, -4, 3}));
    }

    @Test
    public void sample4() {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        assertEquals(2, maximumProductSubarray.maxProduct(new int[]{0, 2}));
    }
}