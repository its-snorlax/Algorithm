//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int count = 1;
        int currentEnd = points[0][1];

        for (int[] point : points) {
            if (point[0] <= currentEnd) {
                currentEnd = Math.min(currentEnd, point[1]);
            } else {
                count++;
                currentEnd = point[1];
            }
        }
        return count;
    }
}
