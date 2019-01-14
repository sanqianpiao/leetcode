import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        Board board = new Board(n);
        List<List<String>> combs = new ArrayList<>();
        helper(combs, board, 0);
        return combs;
    }

    public void helper(List<List<String>> combs, Board board, int col) {
        if (col >= board.n) {
            combs.add(board.toStringList());
            return;
        }

        for (int row = 0; row < board.n; row++) {
            if (board.isSafe(row, col)) {
                board.place(row, col);
                helper(combs, board, col + 1);
                board.remove(row, col);
            }

        }
    }

    static class Board {
        int n;
        char[][] board;

        public Board(int n) {
            this.board = new char[n][n];
            for (int i = 0; i < n; i++)
                Arrays.fill(this.board[i], '.');
            this.n = n;
        }

        public void place(int row, int col) {
            board[row][col] = 'Q';
        }

        public void remove(int row, int col) {
            board[row][col] = '.';
        }

        public boolean isSafe(int row, int col) {
            for (int i = 0; i < n; i++) {
                if (board[row][i] == 'Q') return false;
                if (board[i][col] == 'Q') return false;
            }

            for (int i = 0; row + i < n && col + i < n; i++) {
                if (board[row + i][col + i] == 'Q') return false;
            }

            for (int i = 0; row - i >= 0 && col - i >= 0; i++) {
                if (board[row - i][col - i] == 'Q') return false;
            }

            for (int i = 0; row + i < n && col - i >= 0; i++) {
                if (board[row + i][col - i] == 'Q') return false;
            }

            for (int i = 0; row - i >= 0 && col + i < n; i++) {
                if (board[row - i][col + i] == 'Q') return false;
            }
            return true;
        }

        public List<String> toStringList() {
            List<String> list = new ArrayList<>();
            for (int row = 0; row < n; row++) {
                String r = "";
                for (int col = 0; col < n; col++) {
                    r += board[row][col];
                }
                list.add(r);
            }
            return list;
        }
    }
}
