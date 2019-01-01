import apple.laf.JRSUIUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void buildTree() {
        Integer[] a = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        TreeNode root = TreeNode.buildTree(a);
        int[] ints = TreeNode.inOrder(root);
        assertArrayEquals(new int[]{6, 4, 6, 2, 5, 1, 6, 3, 6}, ints);
    }
}