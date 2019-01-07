public class MatrixMinPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int rows = grid.length, cols = grid[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 && col > 0)
                    grid[row][col] += grid[row][col - 1];
                else if (row > 0 && col == 0)
                    grid[row][col] += grid[row - 1][col];
                else if (row > 0 && col > 0)
                    grid[row][col] += Math.min(grid[row][col - 1], grid[row - 1][col]);
            }
        }

        return grid[rows - 1][cols - 1];
    }
}
