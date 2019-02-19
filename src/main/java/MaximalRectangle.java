/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 *
 * Example:
 *
 * Input:
 * [
 *   ["1","0","1","0","0"],
 *   ["1","0","1","1","1"],
 *   ["1","1","1","1","1"],
 *   ["1","0","0","1","0"]
 * ]
 * Output: 6
 */
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[0].length; c++) {
                max = Math.max(max, dfs(matrix, r, c, r, c));
            }
        }
        return max;
    }

    public int dfs(char[][] a, int sr, int sc, int r, int c) {
        if(r < 0 || r == a.length || c < 0 || c == a[0].length || a[r][c] == '0') return 0;
        int res = 0;
        for(int i = sr; i <= r; i++) {
            for(int j = sc; j <= c; j++) {
                if(a[i][j] == '0') return 0;
                res++;
            }
        }
        int right = dfs(a, sr, sc, r + 1, c);
        int down = dfs(a, sr, sc, r, c + 1);
        return Math.max(res, Math.max(right, down));
    }
}
