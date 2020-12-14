package algos;

public class KnapsackProblem {
    public int findMaxPrice(int[] weights, int[] price, int totalWeight) {
        int[][] dp = new int[price.length + 1][totalWeight + 1];

        for (int i = 1; i < weights.length; i++) {
            for (int j = 0; j <= totalWeight; j++) {
                if (j < weights[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] =
                        Math.max(price[i] + dp[i - 1][j - weights[i]], dp[i - 1][j]);
            }
        }
        return dp[price.length - 1][totalWeight];
    }
}
