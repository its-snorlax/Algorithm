//https://leetcode.com/problems/binary-tree-tilt/
package leetCode;

import tree.TreeNode;

public class BinaryTreeTilt {
    int tilt = 0;

    public int findTilt(TreeNode root) {
        helper(root);
        return tilt;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;
        int leftSum = helper(node.left);
        int rightSum = helper(node.right);
        tilt += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + node.val;
    }
}
