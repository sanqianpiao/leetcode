/**
 * Time complexity: O(S * N)
 * S is the amount, and N is the count of denomination
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        return helper(coins, amount, new int[amount + 1]);
    }

    public int helper(int[] coins, int target, int[] dp) {
        if (target == 0) return 0;
        if (dp[target] != 0) return dp[target];
        int min = Integer.MAX_VALUE;
        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];
            if (target - coin < 0) continue;
            int res = helper(coins, target - coin, dp);
            System.out.println(target + " - " + res);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        dp[target] = (min == Integer.MAX_VALUE) ? -1 : min;
        return dp[target];
    }
}
