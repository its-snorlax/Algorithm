package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumOperationsToReduceXToZeroTest {
    @Test
    public void sample1() {
        int[] input = {1, 1, 4, 2, 3};
        assertEquals(2, new MinimumOperationsToReduceXToZero().minOperations(input, 5));
    }

    @Test
    public void sample2() {
        int[] input = {5, 6, 7, 8, 9};
        assertEquals(-1, new MinimumOperationsToReduceXToZero().minOperations(input, 4));
    }

    @Test
    public void sample3() {
        int[] input = {3, 2, 20, 1, 1, 3};
        assertEquals(5, new MinimumOperationsToReduceXToZero().minOperations(input, 10));
    }
}