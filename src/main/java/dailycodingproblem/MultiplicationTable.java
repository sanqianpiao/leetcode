package dailycodingproblem;

/**
 * This problem was asked by Apple.
 * <p>
 * Suppose you have a multiplication table that is N by N. That is, a 2D array where the value at the i-th row and j-th column is (i + 1) * (j + 1) (if 0-indexed) or i * j (if 1-indexed).
 * <p>
 * Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.
 * <p>
 * For example, given N = 6 and X = 12, you should return 4, since the multiplication table looks like this:
 * <p>
 * | 1 | 2 | 3 | 4 | 5 | 6 |
 * | 2 | 4 | 6 | 8 | 10 | 12 |
 * | 3 | 6 | 9 | 12 | 15 | 18 |
 * | 4 | 8 | 12 | 16 | 20 | 24 |
 * | 5 | 10 | 15 | 20 | 25 | 30 |
 * | 6 | 12 | 18 | 24 | 30 | 36 |
 * <p>
 * And there are 4 12's in the table.
 */
public class MultiplicationTable {

    public int numberOfTimes(int n, int x) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count;
    }
}
