package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBinaryTreeTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode level1 = new TreeNode(20);
        root.right = level1;
        level1.left = new TreeNode(15);
        level1.right = new TreeNode(7);

        assertTrue(new BalancedBinaryTree().isBalanced(root));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        TreeNode two = new TreeNode(2);
        root.left = two;
        two.right = new TreeNode(3);
        TreeNode three = new TreeNode(3);
        two.left = three;
        three.right = new TreeNode(4);
        three.left = new TreeNode(4);

        assertFalse(new BalancedBinaryTree().isBalanced(root));
    }
}