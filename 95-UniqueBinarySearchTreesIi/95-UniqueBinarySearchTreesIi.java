// Last updated: 09/07/2026, 11:50:26
import java.util.*;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return build(1, n);
    }
    
    private List<TreeNode> build(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        
        // choose root between start and end
        for (int i = start; i <= end; i++) {
            // all possible left subtrees
            List<TreeNode> leftTrees = build(start, i - 1);
            // all possible right subtrees
            List<TreeNode> rightTrees = build(i + 1, end);
            
            // combine them with root i
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    allTrees.add(root);
                }
            }
        }
        return allTrees;
    }
}
