//https://leetcode.com/problems/house-robber-iii/
package leetCode;

import tree.TreeNode;

public class HouseRobber3 {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int evenLevel = root.val;
        if (root.left != null) evenLevel += rob(root.left.left) + rob(root.left.right);
        if (root.right != null) evenLevel += rob(root.right.left) + rob(root.right.right);

        int oddLevel = rob(root.left) + rob(root.right);
        return Math.max(evenLevel, oddLevel);
    }
}
