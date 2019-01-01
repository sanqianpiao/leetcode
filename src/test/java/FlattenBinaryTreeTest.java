import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FlattenBinaryTreeTest {

    FlattenBinaryTree inst = new FlattenBinaryTree();

    @Test
    public void flatten() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
        int[] ints = TreeNode.inOrder(root);
        System.out.println(Arrays.toString(ints));

        inst.flatten(root);
    }

    @Test
    public void name() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3});
        int[] ints = TreeNode.inOrder(root);
        System.out.println(Arrays.toString(ints));

        inst.flatten(root);
    }
}