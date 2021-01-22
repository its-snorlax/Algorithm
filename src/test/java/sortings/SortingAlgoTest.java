package sortings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingAlgoTest {
    @Test
    public void sample1() {
        MergeSort mergeSort = new MergeSort();
        int[] actualOutput = mergeSort.sort(new int[]{6, 5, 4, 3, 2, 1});
        int[] expectedOutput = new int[]{1, 2, 3, 4, 5, 6};

        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(actualOutput));
    }
}