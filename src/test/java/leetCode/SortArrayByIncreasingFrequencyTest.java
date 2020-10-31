package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayByIncreasingFrequencyTest {
    @Test
    public void sample1() {
        int[] input = {1, 1, 2, 2, 2, 3};
        int[] output = {3, 1, 1, 2, 2, 2};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new SortArrayByIncreasingFrequency().frequencySort(input)));
    }

    @Test
    public void sample2() {
        int[] input = {2, 3, 1, 3, 2};
        int[] output = {1, 3, 3, 2, 2};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new SortArrayByIncreasingFrequency().frequencySort(input)));
    }

    @Test
    public void sample3() {
        int[] input = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        int[] output = {5, -1, 4, 4, -6, -6, 1, 1, 1};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new SortArrayByIncreasingFrequency().frequencySort(input)));
    }
}