
class Solution {

    public int change(int amount, int[] coins) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(amount, coins, 0, dp);
    }

    public int helper(int amount, int[] coins, int i, int[][] dp) {

        if (amount == 0)
            return 1;

        if (amount < 0 || i == coins.length)
            return 0;

        if (dp[i][amount] != -1)
            return dp[i][amount];

        int take = helper(amount - coins[i], coins, i, dp);

        int skip = helper(amount, coins, i + 1, dp);

        dp[i][amount] = take + skip;

        return dp[i][amount];
    }
}