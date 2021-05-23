package leetCode;

//https://leetcode.com/problems/maximum-product-subarray/submissions/
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int result = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) result = Math.max(result, nums[i]);

        for (int i=0; i<nums.length-1; i++) {
            int[] dp = new int[nums.length];
            for (int j=i; j<nums.length-1; j++) {
                if (i == j) dp[j + 1] = nums[i] * nums[j + 1];
                else dp[j + 1] = dp[j] * nums[j + 1];
                result = Math.max(dp[j+1], result);
            }
        }
        return result;
    }
}
