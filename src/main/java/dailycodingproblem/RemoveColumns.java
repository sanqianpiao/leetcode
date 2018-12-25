package dailycodingproblem;

/**
 * This problem was asked by Google.
 * <p>
 * You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed
 * to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is
 * lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.
 * <p>
 * For example, given the following table:
 * <p>
 * cba
 * daf
 * ghi
 * This is not ordered because of the a in the center. We can remove the second column to make it ordered:
 * <p>
 * ca
 * df
 * gi
 * So your function should return 1, since we only needed to remove 1 column.
 * <p>
 * As another example, given the following table:
 * <p>
 * abcdef
 * Your function should return 0, since the rows are already ordered (there's only one row).
 * <p>
 * As another example, given the following table:
 * <p>
 * zyx
 * wvu
 * tsr
 * Your function should return 3, since we would need to remove all the columns to order it.
 */
public class RemoveColumns {

    public int remove(char[][] m) {
        if (m == null || m.length < 2) return 0;
        int res = 0;
        for (int c = 0; c < m[0].length; c++) {
            int last = m[0][c];
            for (int r = 1; r < m.length; r++) {
                if (m[r][c] - last < 0) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
