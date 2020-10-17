//https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
package leetCode;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        double mean;
        int elementRemoved = (int) (0.05 * arr.length);
        Arrays.sort(arr);
        int end = arr.length - elementRemoved;
        int sum = 0;
        for (int i = elementRemoved; i < end; i++) {
            sum += arr[i];
        }
        mean = (double) sum / (end - elementRemoved);
        return mean;
    }
}
