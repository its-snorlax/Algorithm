//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
package leetCode;

public class BestTimeToBuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (k > n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) profit += Math.max(0, prices[i] - prices[i - 1]);
            return profit;
        }
        int[][] dp = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            int profit = -prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], profit + prices[j]);
                profit = Math.max(profit, dp[i - 1][j - 1] - prices[j]);
            }
        }

        return dp[k][n - 1];
    }
}
