// Last updated: 09/07/2026, 11:50:04
class Solution {
    public int rob(TreeNode root) {
        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }

    private int[] helper(TreeNode node) {
        if (node == null)
            return new int[]{0, 0};

        int[] left = helper(node.left);
        int[] right = helper(node.right);

        int rob = node.val + left[0] + right[0];

        int notRob =
                Math.max(left[0], left[1]) +
                Math.max(right[0], right[1]);

        return new int[]{notRob, rob};
    }
}