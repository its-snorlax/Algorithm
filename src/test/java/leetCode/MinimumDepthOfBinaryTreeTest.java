package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class MinimumDepthOfBinaryTreeTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        root.right = twenty;
        twenty.left = new TreeNode(15);
        twenty.right = new TreeNode(7);

        assertEquals(2, new MinimumDepthOfBinaryTree().minDepth(root));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        root.right = three;
        TreeNode four = new TreeNode(4);
        three.right = four;
        TreeNode five = new TreeNode(5);
        four.right = five;
        five.right = new TreeNode(6);

        assertEquals(5, new MinimumDepthOfBinaryTree().minDepth(root));
    }

}