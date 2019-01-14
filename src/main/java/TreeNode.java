import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode buildTree(Integer[] a) {
        if (a == null || a.length == 0) return null;
        return insertLevelOrder(a, null, 0);
    }

    private static TreeNode insertLevelOrder(Integer[] arr, TreeNode root, int i) {
        if (i < arr.length && arr[i] != null) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    public static int[] inOrder(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void inOrder(TreeNode root, List<Integer> output) {
        if (root == null) return;
        inOrder(root.left, output);
        output.add(root.val);
        inOrder(root.right, output);
    }
}
