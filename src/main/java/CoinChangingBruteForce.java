public class CoinChangingBruteForce {

    int min = Integer.MAX_VALUE;

    public int change(int amount, int[] coins) {
        helper(amount, coins, 0, 0);
        return min;
    }

    public void helper(int amount, int[] coins, int start, int count) {
        if (amount == 0) {
            min = Math.min(min, count);
            return;
        }
        for (int i = start; i < coins.length; i++) {
            if (amount - coins[i] >= 0)
                helper(amount - coins[i], coins, i, count + 1);
        }
    }
}
