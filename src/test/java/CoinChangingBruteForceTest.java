import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangingBruteForceTest {

    CoinChangingBruteForce inst = new CoinChangingBruteForce();

    @Test
    public void change() {
        int[] coins = {1, 2, 3, 5};
        int i = inst.change(11, coins);
        assertEquals(3, i);
    }

    @Test
    public void change2() {
        int[] coins = {6, 1, 2, 3, 7};
        int i = inst.change(13, coins);
        assertEquals(2, i);
    }
}