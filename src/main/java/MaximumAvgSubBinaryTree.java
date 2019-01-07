import java.util.HashMap;
import java.util.Map;

/**
 * https://www.lintcode.com/problem/subtree-with-maximum-average/
 */
public class MaximumAvgSubBinaryTree {

    float max = Integer.MIN_VALUE;
    Map<TreeNode, Integer> dp = new HashMap<>();
    TreeNode maxroot;

    public TreeNode findSubtree2(TreeNode root) {
        preorder(root);
        System.out.println(max);
        return maxroot;
    }

    public void preorder(TreeNode root) {
        if (root == null) return;
        int s = sum(root);
        int n = nodes(root);
        float avg = (float) s / (float) n;
        if (avg > max) {
            maxroot = root;
            max = avg;
        }

        preorder(root.left);
        preorder(root.right);
    }


    public int nodes(TreeNode root) {
        if (root == null) return 0;
        int left = nodes(root.left);
        int right = nodes(root.right);
        return 1 + left + right;
    }

    public int sum(TreeNode root) {
        if (dp.containsKey(root)) return dp.get(root);
        if (root == null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        int res = root.val + left + right;
        dp.put(root, res);
        return res;
    }
}
