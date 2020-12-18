//https://leetcode.com/problems/subtree-of-another-tree/
package leetCode;

import tree.TreeNode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) return false;
        return helper(s, t) || isSubtree(s.left, t) ||
                isSubtree(s.right, t);
    }

    public boolean helper(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            return (s.val == t.val) && helper(s.left, t.left) && helper(s.right, t.right);
        } else return s == null && t == null;
    }
}
