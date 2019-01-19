import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TreeNodeTest {

    @Test
    public void buildTree() {
        Integer[] a = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        TreeNode root = TreeNode.buildTree(a);
        int[] ints = TreeNode.inOrder(root);
        assertArrayEquals(new int[]{6, 4, 6, 2, 5, 1, 6, 3, 6}, ints);
    }

    @Test
    public void bst() {
        Integer[] a = {5, 1, 4, null, null, 3, 6};
        TreeNode root = TreeNode.buildTree(a);
        int[] ints = TreeNode.inOrder(root);
        System.out.println(Arrays.toString(ints));
    }
}