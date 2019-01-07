public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        short[] rows = new short[9];
        short[] cols = new short[9];
        short[] block = new short[9];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];
                if (ch == '.') continue;
                short value = (short) (1 << ch - '1');

                int b = 3 * (row / 3) + col / 3;
                if ((rows[row] & value) > 0) return false;
                if ((cols[col] & value) > 0) return false;
                if ((block[b] & value) > 0) return false;

                rows[row] |= value;
                cols[col] |= value;
                block[b] |= value;
            }
        }
        return true;
    }
}
