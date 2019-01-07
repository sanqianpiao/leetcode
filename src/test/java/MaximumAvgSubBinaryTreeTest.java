import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaximumAvgSubBinaryTreeTest {

    Integer[] a = {1, -5, 11, 1, 2, 4, -2};
    TreeNode root = TreeNode.buildTree(a);

    MaximumAvgSubBinaryTree inst;

    @Before
    public void setUp() throws Exception {
        inst = new MaximumAvgSubBinaryTree();
    }

    @Test
    public void findSubtree2() {
        TreeNode subtree2 = inst.findSubtree2(root);
        int[] nodes = TreeNode.inOrder(subtree2);
        System.out.println(Arrays.toString(nodes));
    }

    @Test
    public void nodes() {
        int sum = inst.sum(root);
        assertEquals(Arrays.stream(a).mapToInt(Integer::intValue).sum(), sum);
    }

    @Test
    public void sum() {
        int nodes = inst.nodes(root);
        assertEquals(a.length, nodes);
    }

    @Test
    public void findSubtree3() {
        Integer[] a = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16};
        TreeNode root = TreeNode.buildTree(a);

        TreeNode subtree = inst.findSubtree2(root);
        int[] nodes = TreeNode.inOrder(subtree);
        System.out.println(Arrays.toString(nodes));
    }
}