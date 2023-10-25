class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 0);

        dp[0] = 1;

        for (int i = coins.length - 1; i >= 0; i--) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[amount];
    }
}

// Time and Space are O(n);