//https://leetcode.com/problems/binary-tree-right-side-view/
package leetCode;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeRightSideView {
    List<Integer> output;
    HashMap<Integer, TreeNode> map = new HashMap<>();

    public List<Integer> rightSideView(TreeNode root) {
        output = new ArrayList<>();
        helper(root, 0);
        for (TreeNode node : map.values()) output.add(node.val);
        return output;
    }

    public void helper(TreeNode root, int level) {
        if (root == null) return;
        map.put(level, root);
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}
