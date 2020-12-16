package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assertTrue(new ValidateBinarySearchTree().isValidBST(root));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        TreeNode four = new TreeNode(4);
        root.right = four;
        four.left = new TreeNode(3);
        four.right = new TreeNode(6);

        assertFalse(new ValidateBinarySearchTree().isValidBST(root));
    }

    @Test
    public void sample3() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        TreeNode six = new TreeNode(6);
        root.right = six;
        six.left = new TreeNode(3);
        six.right = new TreeNode(7);

        assertFalse(new ValidateBinarySearchTree().isValidBST(root));
    }
}