//https://leetcode.com/problems/increasing-order-search-tree/
package leetCode;

import tree.TreeNode;

import java.util.ArrayList;

public class IncreasingOrderSearchTree {
    ArrayList<Integer> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        helperFunction(root);

        TreeNode newRoot = new TreeNode(list.get(0));
        TreeNode temp = newRoot;
        for (int i = 1; i < list.size(); i++) {
            temp.right = new TreeNode(list.get(i));
            temp = temp.right;
        }
        return newRoot;
    }

    private void helperFunction(TreeNode root) {
        if (root == null) return;
        helperFunction(root.left);
        list.add(root.val);
        helperFunction(root.right);
    }
}
