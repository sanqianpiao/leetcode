package dailycodingproblem;


/**
 * This problem was asked by Facebook.
 * <p>
 * There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the
 * top-left corner and getting to the bottom-right corner. You can only move right or down.
 * <p>
 * For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:
 * <p>
 * Right, then down
 * Down, then right
 * Given a 5 by 5 matrix, there are 70 ways to get to the bottom-right.
 */
public class NbyMmatrixOfZeroes {
    static int numberOfPaths(int m, int n) {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1)
            return 1;

        // If diagonal movements are allowed then
        // the last addition is required.
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
        // + numberOfPaths(m-1,n-1);
    }
}
