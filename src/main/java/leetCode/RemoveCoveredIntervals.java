//https://leetcode.com/problems/remove-covered-intervals/
package leetCode;

import java.util.Arrays;

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] != v2[0] ? v1[0] - v2[0] : v2[1] - v1[1]);
        int removed = 0, last = -1;
        for (int[] interval : intervals) {
            if (interval[1] <= last) {
                removed += 1;
            } else {
                last = interval[1];
            }
        }
        return intervals.length - removed;
    }
}
