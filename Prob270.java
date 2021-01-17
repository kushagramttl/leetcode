public class Prob270 {


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

    public int closestValue(TreeNode root, double target) {
        double minDiff = Double.MAX_VALUE;
        int min = root.val;
        while(root != null && min != target) {
            double diff = Math.abs(target - root.val);

            if (diff < minDiff) {
                minDiff = diff;
                min = root.val;
            }

            if (target > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return min;
    }

}
