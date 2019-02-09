package projecteuler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOf3And5 {

    public int calculate(int n) {
        int i3 = 1, i5 = 1, sum = 0, m = 1, m3 = 0, m5 = 0;
        while (true) {
            m3 = i3 * 3;
            m5 = i5 * 5;
            if (m3 > n || m5 > n) break;
            if (m3 < m5) {
                i3++;
                m = m3;
            } else {
                i5++;
                m = m5;
            }
            sum += m;
        }
        return sum;
    }
}
