package leetCode;

public class NumberOfLongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] cdp = new int[nums.length];

        int maxcount = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            cdp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        cdp[i] = cdp[j];
                    } else if (dp[j] + 1 == dp[i])
                        cdp[i] += cdp[j];
                }
            }
            if (dp[i] > maxlen) {
                maxlen = dp[i];
                maxcount = cdp[i];
            } else if (dp[i] == maxlen) {
                maxcount += cdp[i];
            }
        }
        return maxcount;
    }
}
