package dailycodingproblem;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This problem was asked by Two Sigma.
 * <p>
 * Using a function rand7() that returns an integer from 1 to 7 (inclusive) with uniform probability, implement a function rand5() that returns an integer from 1 to 5 (inclusive).
 */
public class Rand5 {

    public int rand7() {
        return ThreadLocalRandom.current().nextInt(1, 8);
    }

    public int rand5() {
        int r = rand7();
        if (r >= 1 && r <= 5) return r;
        else return rand5();
    }
}
