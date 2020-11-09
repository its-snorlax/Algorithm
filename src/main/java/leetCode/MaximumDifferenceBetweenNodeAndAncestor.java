package leetCode;

import tree.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor {
    int res = 0;

    public int maxAncestorDiff(TreeNode root) {
        getMaxDiff(root);
        return res;
    }

    public int[] getMaxDiff(TreeNode root) {
        if (root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        if (root.left == null && root.right == null)
            return new int[]{root.val, root.val};

        int[] leftMinMax = getMaxDiff(root.left);
        int[] rightMinMax = getMaxDiff(root.right);

        int min = Math.min(leftMinMax[0], rightMinMax[0]);
        int max = Math.max(leftMinMax[1], rightMinMax[1]);

        res = Math.max(res, Math.max(Math.abs(root.val - min), Math.abs(root.val - max)));

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        return new int[]{min, max};
    }
}