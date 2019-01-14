import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NQueensTest {

    NQueens inst = new NQueens();

    @Test
    public void solveNQueens() {
        List<List<String>> lists = inst.solveNQueens(4);
        assertEquals(2, lists.size());
    }
}