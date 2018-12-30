package dailycodingproblem;

import java.util.*;

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
public class Islands {

    public int islands(int[][] a) {
        int r = a.length, c = a[0].length, cluster = 0;
        Boolean[][] visited = new Boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (visited[i][j] != null) continue;
                dfs(visited, a, i, j);
                if (visited[i][j]) cluster++;
            }
        }

        return cluster;
    }

    private void dfs(Boolean[][] visited, int[][] a, int r, int c) {
        int maxr = a.length, maxc = a[0].length;
        Queue<Integer[]> q = new LinkedList<>();
        q.offer(new Integer[]{r, c});

        while (q.isEmpty() == false) {
            Integer[] loc = q.poll();
            int row = loc[0], col = loc[1];

            if (visited[row][col] != null) continue;
            visited[row][col] = a[row][col] == 1;

            if (visited[row][col] == false) continue;

            if (row + 1 < maxr) {
                q.offer(new Integer[]{row + 1, col});
            }
            if (row - 1 > -1) {
                q.offer(new Integer[]{row - 1, col});
            }
            if (col + 1 < maxc) {
                q.offer(new Integer[]{row, col + 1});
            }
            if (col - 1 > -1) {
                q.offer(new Integer[]{row, col - 1});
            }
//            if (col + 1 < maxc && row + 1 < maxr) {
//                q.offer(new Integer[]{row + 1, col + 1});
//            }
//            if (col - 1 > -1 && row - 1 > -1) {
//                q.offer(new Integer[]{row - 1, col - 1});
//            }
//            if (col - 1 > -1 && row + 1 < maxr) {
//                q.offer(new Integer[]{row + 1, col - 1});
//            }
//            if (col + 1 < maxc && row - 1 > -1) {
//                q.offer(new Integer[]{row - 1, col + 1});
//            }
        }
    }


}
