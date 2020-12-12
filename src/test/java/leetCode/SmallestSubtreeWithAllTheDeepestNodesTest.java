package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class SmallestSubtreeWithAllTheDeepestNodesTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        root.left = five;
        TreeNode one = new TreeNode(1);
        root.right = one;
        five.left = new TreeNode(6);
        TreeNode two = new TreeNode(2);
        five.right = two;
        two.left = new TreeNode(7);
        two.right = new TreeNode(4);
        one.left = new TreeNode(0);
        one.right = new TreeNode(8);

        TreeNode actualOutput = new SmallestSubtreeWithAllTheDeepestNodes().subtreeWithAllDeepest(root);
        assertEquals(2, actualOutput.val);
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(1);
        TreeNode actualOutput = new SmallestSubtreeWithAllTheDeepestNodes().subtreeWithAllDeepest(root);
        assertEquals(1, actualOutput.val);
    }

    @Test
    public void sample3() {
        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        root.left = one;
        one.right = new TreeNode(2);
        root.right = new TreeNode(4);
        TreeNode actualOutput = new SmallestSubtreeWithAllTheDeepestNodes().subtreeWithAllDeepest(root);
        assertEquals(2, actualOutput.val);
    }
}