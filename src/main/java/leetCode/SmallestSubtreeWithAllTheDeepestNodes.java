//https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
package leetCode;

import javafx.util.Pair;
import tree.TreeNode;

public class SmallestSubtreeWithAllTheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return helper(root).getValue();
    }

    private Pair<Integer, TreeNode> helper(TreeNode root) {
        if (root == null) return new Pair<>(0, null);
        Pair<Integer, TreeNode> left = helper(root.left);
        Pair<Integer, TreeNode> right = helper(root.right);

        Integer leftDepth = left.getKey();
        Integer rightDepth = right.getKey();

        if (leftDepth.equals(rightDepth)) return new Pair<>(1 + leftDepth, root);
        else if (leftDepth > rightDepth) return new Pair<>(1 + leftDepth, left.getValue());
        else return new Pair<>(1 + rightDepth, right.getValue());
    }
}
