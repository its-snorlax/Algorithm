//https://leetcode.com/problems/minimum-depth-of-binary-tree/
package leetCode;

import tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right != null) return 1 + minDepth(root.right);
        if (root.left != null && root.right == null) return 1 + minDepth(root.left);
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
