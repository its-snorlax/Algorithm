package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    @Test
    public void sample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] expected = {1, 2, 2, 3, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        assertEquals(Arrays.toString(expected), Arrays.toString(nums1));
    }
    @Test
    public void sample2() {
        int[] nums1 = {1};
        int[] nums2 = {};

        int[] expected = {1};
        new MergeSortedArray().merge(nums1, 1, nums2, 0);
        assertEquals(Arrays.toString(expected), Arrays.toString(nums1));
    }
}