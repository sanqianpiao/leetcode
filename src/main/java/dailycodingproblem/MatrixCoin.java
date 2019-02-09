package dailycodingproblem;

/**
 * You are given a 2-d matrix where each cell represents number of coins in that cell. Assuming we start at matrix[0][0], and can only move right or down, find the maximum number of coins you can collect by the bottom right corner.
 * <p>
 * For example, in this matrix
 * <p>
 * 0 3 1 1
 * 2 0 0 4
 * 1 5 3 1
 * The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.
 */
public class MatrixCoin {

    int max = 0;

    public int max(int[][] m) {
        helper(m, 0, 0, 0);
        return max;
    }

    private void helper(int[][] m, int r, int c, int sum) {
        if (r >= m.length || c >= m[0].length) return;
        if (r == m.length - 1 && c == m[0].length - 1) {
            max = Math.max(max, sum + m[r][c]);
            return;
        }
        helper(m, r + 1, c, sum + m[r][c]);
        helper(m, r, c + 1, sum + m[r][c]);
    }
}
