import org.junit.Test;

import static org.junit.Assert.*;

public class LongestUnivaluePathTest {

    LongestUnivaluePath inst = new LongestUnivaluePath();

    @Test
    public void longestUnivaluePath() {
        Integer[] a = {5, 4, 5, 1, 1, 5};
        TreeNode root = TreeNode.buildTree(a);

        int i = inst.longestUnivaluePath(root);
        System.out.println(i);
        assertEquals(2, i);
    }

    @Test
    public void longestUnivaluePath2() {
        Integer[] a = {5, 4, 5};
        TreeNode root = TreeNode.buildTree(a);

        int i = inst.longestUnivaluePath(root);
        System.out.println(i);
        assertEquals(1, i);
    }

    @Test
    public void longestUnivaluePath3() {
        Integer[] a = {1, 2, 3, 2};
        TreeNode root = TreeNode.buildTree(a);

        int i = inst.longestUnivaluePath(root);
        System.out.println(i);
        assertEquals(1, i);
    }
}