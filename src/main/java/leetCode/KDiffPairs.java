//https://leetcode.com/problems/k-diff-pairs-in-an-array/

package leetCode;

import java.util.Arrays;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while (left < nums.length && right < nums.length) {
            int sub = nums[right] - nums[left];
            if (sub == k) {
                count++;
                left++;
                while (left < nums.length && nums[left] == nums[left - 1]) {
                    left++;
                    right = left + 1;
                }
            }
            if (sub > k) {
                left++;
                right = left + 1;
            }
            if (sub < k) {
                right++;
            }
        }
        return count;
    }
}
