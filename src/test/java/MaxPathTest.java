import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPathTest {

    MaxPath inst;

    @Before
    public void setUp() throws Exception {
        inst = new MaxPath();
    }

    @Test
    public void max1() {
        Integer[] a = {1, 2, 3};
        TreeNode root = TreeNode.buildTree(a);
        int m = inst.max(root);
        assertEquals(6, m);
    }

    @Test
    public void max2() {
        Integer[] a = {-10, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.buildTree(a);
        int m = inst.max(root);
        assertEquals(42, m);
    }

    @Test
    public void max() {
        Integer[] a = {6, 4, 7, 1, 5, 8, 9, 2, 3};
        TreeNode root = TreeNode.buildTree(a);
        int m = inst.max(root);
        assertEquals(31, m);
    }
}