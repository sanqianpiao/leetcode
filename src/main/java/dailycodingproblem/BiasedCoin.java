package dailycodingproblem;


import java.util.concurrent.ThreadLocalRandom;

//Problem
//This problem was asked by Square.
//
//Assume you have access to a function toss_biased() which returns 0 or 1 with a probability that's not 50-50 (but also not 0-100 or 100-0). You do not know the bias of the coin.
//
//Write a function to simulate an unbiased coin toss.
public class BiasedCoin {

    /**
     * This funcion returns 1 and 0, each result has the probability of 0.24 and 0.76 respectively.
     *
     * @return
     */
    public int tossBiased() {
        return ThreadLocalRandom.current().nextInt(0, 100) <= 23 ? 1 : 0;
    }

    public int tossUnbiased() {
        int t1 = 0, t2 = 0;
        while (t1 == t2) {
            t1 = tossBiased();
            t2 = tossBiased();
        }
        return t1;
    }
}
