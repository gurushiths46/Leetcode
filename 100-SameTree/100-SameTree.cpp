// Last updated: 09/07/2026, 11:50:23
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        // both null
        if (p == NULL && q == NULL)
            return true;

        // one null or values different
        if (p == NULL || q == NULL || p->val != q->val)
            return false;

        // check left and right subtrees
        return isSameTree(p->left, q->left) &&
               isSameTree(p->right, q->right);
    }
};