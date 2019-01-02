/**
 * The inorder result of a BST should be mono-increasing, otherwise it's not an BST.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        inorder(root);
        return valid;
    }

    Integer last = null;
    Boolean valid = true;

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (last == null) last = root.val;
        else if (last >= root.val) {
            valid = false;
            return;
        } else {
            last = root.val;
        }
        inorder(root.right);
    }
}
