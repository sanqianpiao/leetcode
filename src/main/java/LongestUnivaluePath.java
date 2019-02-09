public class LongestUnivaluePath {
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;

        dfs(root, root.val);
        return max;
    }

    int max = 0;

    public int dfs(TreeNode root, int val) {
        if (root == null) return 0;
        int left = dfs(root.left, root.val);
        int right = dfs(root.right, root.val);

        max = Math.max(max, left + right);

        return root.val == val ? 1 + Math.max(left, right) : 0;
    }
}
