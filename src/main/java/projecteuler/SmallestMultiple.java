package projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

    public int smallest(int to) {
        int n = to;
        while(true) {
            boolean all = true;
            for(int i = 2; i < to; i++) {
                if(n % i != 0) {
                    all = false;
                    break;
                }
            }
            if(all) return n;
            n += to;
        }
    }
}
