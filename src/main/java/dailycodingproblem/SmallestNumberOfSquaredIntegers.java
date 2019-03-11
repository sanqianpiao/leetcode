package dailycodingproblem;

/**
 * This problem was asked by Facebook.
 * <p>
 * Given a positive integer n, find the smallest number of squared integers which sum to n.
 * <p>
 * For example, given n = 13, return 2 since 13 = 32 + 22 = 9 + 4.
 * <p>
 * Given n = 27, return 3 since 27 = 32 + 32 + 32 = 9 + 9 + 9.
 */
public class SmallestNumberOfSquaredIntegers {

    public int smallesetNumber(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int count = 0;

        while (n > 0) {
            int x = n / 2 == 0 ? 1 : n / 2;
            int d = x * x;
            while (d > n) {
                x--;
                d = x * x;
            }
            if (n >= d) {
                count++;
                n -= d;
            }
        }
        return count;
    }
}
