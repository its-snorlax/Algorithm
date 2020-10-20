package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void sample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode level1 = new TreeNode(20);
        root.right = level1;
        level1.right = new TreeNode(7);
        level1.left = new TreeNode(15);

        assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
    }
}