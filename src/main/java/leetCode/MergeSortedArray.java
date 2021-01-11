//https://leetcode.com/problems/merge-sorted-array/
package leetCode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) return;

        int[] afterMerge = new int[m + n];
        int pos = 0;
        int positionOne = 0;
        int positionTwo = 0;
        int elementsUptoInNumOne = nums1.length - nums2.length;
        while (positionOne < elementsUptoInNumOne && positionTwo < nums2.length) {
            if (nums1[positionOne] < nums2[positionTwo]) {
                afterMerge[pos] = nums1[positionOne];
                positionOne++;
            } else {
                afterMerge[pos] = nums2[positionTwo];
                positionTwo++;
            }
            pos++;
        }
        while (pos < m + n) {
            if (positionOne < elementsUptoInNumOne) afterMerge[pos++] = nums1[positionOne++];
            else if (positionTwo < nums2.length) afterMerge[pos++] = nums2[positionTwo++];
        }
        if (afterMerge.length >= 0) System.arraycopy(afterMerge, 0, nums1, 0, afterMerge.length);
    }
}
