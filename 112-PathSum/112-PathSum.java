// Last updated: 09/07/2026, 11:50:16
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return targetSum == root.val;

        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}