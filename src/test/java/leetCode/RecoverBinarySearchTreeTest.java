package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class RecoverBinarySearchTreeTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        root.left = three;
        three.right = new TreeNode(2);

        new RecoverBinarySearchTree().recoverTree(root);

        assertEquals(3, root.val);
        assertEquals(1, root.left.val);
        assertEquals(2, root.left.right.val);
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode four = new TreeNode(4);
        root.left = one;
        root.right = four;
        four.left = new TreeNode(2);

        new RecoverBinarySearchTree().recoverTree(root);

        assertEquals(2, root.val);
        assertEquals(1, root.left.val);
        assertEquals(4, root.right.val);
        assertEquals(3, root.right.left.val);
    }
}