package dailycodingproblem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BiasedCoinTest {

    BiasedCoin bc;

    @Before
    public void setUp() throws Exception {
        bc = new BiasedCoin();
    }

    @Test
    public void tossBiased() {
        int one = 0, zero = 0;
        for (int i = 0; i < 1_000_000; i++) {
            if (bc.tossBiased() == 0) zero++;
            else one++;
        }
        System.out.println(zero + " - " + one);
    }

    @Test
    public void tossUnbiased() {
        int one = 0, zero = 0;
        for (int i = 0; i < 1_000_000; i++) {
            if (bc.tossUnbiased() == 0) zero++;
            else one++;
        }
        System.out.println(zero + " - " + one);
    }
}