import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

    CoinChange inst = new CoinChange();

    @Test
    public void coinChange() {
        int[] coins = {1, 2, 5};
        int min = inst.coinChange(coins, 11);
        assertEquals(3, min);
    }
}