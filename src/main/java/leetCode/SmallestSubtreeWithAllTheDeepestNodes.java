//https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
package leetCode;

import tree.TreeNode;

import java.util.AbstractMap;
import java.util.Map;

public class SmallestSubtreeWithAllTheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return helper(root).getValue();
    }

    private Map.Entry<Integer, TreeNode> helper(TreeNode root) {
        if (root == null) return new AbstractMap.SimpleEntry<>(0, null);
        Map.Entry<Integer, TreeNode> left = helper(root.left);
        Map.Entry<Integer, TreeNode> right = helper(root.right);

        Integer leftDepth = left.getKey();
        Integer rightDepth = right.getKey();

        if (leftDepth.equals(rightDepth)) return new AbstractMap.SimpleEntry<>(1 + leftDepth, root);
        else if (leftDepth > rightDepth) return new AbstractMap.SimpleEntry<>(1 + leftDepth, left.getValue());
        else return new AbstractMap.SimpleEntry<>(1 + rightDepth, right.getValue());
    }
}
