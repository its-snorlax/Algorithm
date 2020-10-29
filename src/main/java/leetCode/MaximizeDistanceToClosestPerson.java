//https://leetcode.com/problems/maximize-distance-to-closest-person/
package leetCode;

public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int firstPerson = Integer.MIN_VALUE;
        int lastPerson = Integer.MAX_VALUE;
        int result = 0;
        int val = 0;

        for (int i = 0; i < seats.length; i++) {
            if (firstPerson == Integer.MIN_VALUE && seats[i] == 1) {
                firstPerson = i;
            }
            if (seats[i] == 1) {
                val = 0;
                lastPerson = i;
            } else {
                val++;
                result = Math.max(result, (val + 1) / 2);
            }
        }
        return Math.max(
                Math.max(result, firstPerson),
                Math.max(result, (seats.length - 1) - lastPerson)
        );
    }
}
