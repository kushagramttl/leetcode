import java.util.Stack;
import java.util.TreeMap;

public class Prob98 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private boolean validate(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        } else if (max != null && root.val >= max || min != null && root.val <= min) {
            return false;
        } else {
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
        }

    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}
