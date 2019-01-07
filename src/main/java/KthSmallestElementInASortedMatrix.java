import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        if (k == 1) return matrix[0][0];
        int n = matrix.length;
        if (k == n * n) return matrix[n - 1][n - 1];

        PriorityQueue<Cell> q = new PriorityQueue<>();
        for (int row = 0; row < n; row++) {
            Cell cell = new Cell(row, 0, matrix[row][0]);
            System.out.println(cell);
            q.offer(cell);
        }

        for (int i = 1; i < k; i++) {
            Cell cell = q.poll();
            if (cell.col + 1 < n) {
                Cell c = new Cell(cell.row, cell.col + 1, matrix[cell.row][cell.col + 1]);
                System.out.println(c);
                q.add(c);
            }

        }

        return q.peek().val;
    }

    class Cell implements Comparable<Cell> {
        int row;
        int col;
        int val;

        Cell(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }

        @Override
        public int compareTo(Cell cell) {
            return val - cell.val;
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "row=" + row +
                    ", col=" + col +
                    ", val=" + val +
                    '}';
        }
    }
}
