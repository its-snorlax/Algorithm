//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
package leetCode;

import tree.TreeNode;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    TreeNode answer = null;

    public final TreeNode getTargetCopy
            (final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(original, cloned, target);
        return answer;
    }

    private void helper(TreeNode original, TreeNode cloned, TreeNode target) {
        if (original == target) {
            answer = cloned;
            return;
        }
        if (original == null) return;
        helper(original.left, cloned.left, target);
        helper(original.right, cloned.right, target);
    }
}
