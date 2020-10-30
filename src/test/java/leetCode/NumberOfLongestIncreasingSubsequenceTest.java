package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfLongestIncreasingSubsequenceTest {
    @Test
    public void sample1() {
        int[] input = {1, 3, 5, 4, 7};
        int actualOutput = new NumberOfLongestIncreasingSubsequence().findNumberOfLIS(input);

        assertEquals(2, actualOutput);
    }

    @Test
    public void sample2() {
        int[] input = {2, 2, 2, 2, 2};
        int actualOutput = new NumberOfLongestIncreasingSubsequence().findNumberOfLIS(input);

        assertEquals(5, actualOutput);
    }
}