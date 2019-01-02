import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree inst = new ValidateBinarySearchTree();

    @Test
    public void isValidBST() {
        Integer[] a = {5, 1, 4, null, null, 3, 6};
        TreeNode root = TreeNode.buildTree(a);

        assertFalse(inst.isValidBST(root));
    }
}