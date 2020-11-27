package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {
    @Test
    public void sample1() {
        assertTrue(new PartitionEqualSubsetSum().canPartition(new int[]{1, 5, 5, 11}));
    }

    @Test
    public void sample2() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(new int[]{1, 2, 3, 5}));
    }
}