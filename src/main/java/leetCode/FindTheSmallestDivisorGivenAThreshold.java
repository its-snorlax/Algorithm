//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
package leetCode;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 1000000;
        BigDecimal divisor;
        while (l <= r) {
            divisor = new BigDecimal(l + (r - l) / 2);
            int currentSum = 0;
            for (int num : nums) {
                currentSum += new BigDecimal(num).divide(divisor, RoundingMode.UP).intValue();
            }
            if (currentSum > threshold) l = divisor.add(new BigDecimal(1)).intValue();
            else r = divisor.subtract(new BigDecimal(1)).intValue();
        }
        return l;
    }
}
