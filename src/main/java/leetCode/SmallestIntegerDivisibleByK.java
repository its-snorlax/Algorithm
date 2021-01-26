//https://leetcode.com/problems/smallest-integer-divisible-by-k/
package leetCode;

public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        int remainder = 0;
        for (int i = 1; i <= k; i++) {
            remainder = ((remainder * 10) + 1) % k;
            if (remainder == 0) return i;
        }
        return -1;
    }
}
