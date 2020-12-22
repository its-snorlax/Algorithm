package leetCode;

import java.util.Arrays;

public class SmallestRangeII {
    public int smallestRangeII(int[] a, int k) {
        if (a.length < 2) return 0;
        Arrays.sort(a);
        int high = a[a.length-1];
        int low = a[0];
        int range = high - low;

        for (int i = 0; i < a.length-1; i++) {
            int min = Math.min(a[0] + k, a[i+1] - k);
            int max = Math.max(a[a.length - 1] - k, a[i] + k);
            range = Math.min(range, max - min);
        }

        return range;
    }
}
