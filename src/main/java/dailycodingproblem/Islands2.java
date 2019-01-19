package dailycodingproblem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This problem was asked by Amazon.
 * <p>
 * Given a matrix of 1s and 0s, return the number of "islands" in the matrix. A 1 represents land and 0 represents water,
 * so an island is a group of 1s that are neighboring and their perimiter is surrounded by water.
 * <p>
 * For example, this matrix has 4 islands.
 * <p>
 * 1 0 0 0 0
 * 0 0 1 1 0
 * 0 1 1 0 0
 * 0 0 0 0 0
 * 1 1 0 0 1
 * 1 1 0 0 1
 */
public class Islands2 {

    public int islands(int[][] a) {
        int r = a.length, c = a[0].length, cluster = 0;

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (a[row][col] == 1) {
                    cluster++;
                    dfs(a, row, col);
                }
            }
        }

        return cluster;
    }

    private void dfs(int[][] a, int r, int c) {
        if (r < 0 || c < 0 || r >= a.length || c >= a[0].length || a[r][c] == 0) return;
        a[r][c] = 0;
        dfs(a, r + 1, c);
        dfs(a, r - 1, c);
        dfs(a, r, c + 1);
        dfs(a, r, c - 1);
    }
}
