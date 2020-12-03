package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.assertEquals;

public class IncreasingOrderSearchTreeTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        root.left = three;
        TreeNode six = new TreeNode(6);
        root.right = six;
        TreeNode two = new TreeNode(2);
        three.left = two;
        three.right = new TreeNode(4);
        two.left = new TreeNode(1);
        TreeNode eight = new TreeNode(8);
        six.right = eight;
        eight.left = new TreeNode(7);
        eight.right = new TreeNode(9);

        TreeNode actualOutput = new IncreasingOrderSearchTree().increasingBST(root);
        assertEquals(1, actualOutput.val);
        assertEquals(2, actualOutput.right.val);
        assertEquals(3, actualOutput.right.right.val);
        assertEquals(4, actualOutput.right.right.right.val);
        assertEquals(5, actualOutput.right.right.right.right.val);
        assertEquals(6, actualOutput.right.right.right.right.right.val);
        assertEquals(7, actualOutput.right.right.right.right.right.right.val);
        assertEquals(8, actualOutput.right.right.right.right.right.right.right.val);
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);

        TreeNode actualOutput = new IncreasingOrderSearchTree().increasingBST(root);

        assertEquals(1, actualOutput.val);
        assertEquals(5, actualOutput.right.val);
        assertEquals(7, actualOutput.right.right.val);
    }
}