import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    row.add(1);
                    continue;
                }

                if (i > 1 && j > 0 && j != i) {
                    List<Integer> lastRow = res.get(i - 1);
                    row.add(lastRow.get(j) + lastRow.get(j - 1));
                    continue;
                }

                if (j == i && i > 0) row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}
