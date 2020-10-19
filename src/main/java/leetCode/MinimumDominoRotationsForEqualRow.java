//https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
package leetCode;

public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] a, int[] b) {
        int minSwaps = Math.min(numberOfSwapsNeeded(a[0], a, b), numberOfSwapsNeeded(b[0], a, b));
        minSwaps = Math.min(numberOfSwapsNeeded(a[0], b, a), minSwaps);
        minSwaps = Math.min(numberOfSwapsNeeded(b[0], b, a), minSwaps);
        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }

    public int numberOfSwapsNeeded(int target, int[] a, int[] b) {
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != target && b[i] != target) return Integer.MAX_VALUE;
            if (a[i] != target && b[i] == target) swaps++;
        }
        return swaps;
    }
}
