package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class SubtreeOfAnotherTreeTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        root.left = four;
        root.right = new TreeNode(5);
        four.left = new TreeNode(1);
        four.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        assertTrue(new SubtreeOfAnotherTree().isSubtree(root, subRoot));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        root.left = four;
        root.right = new TreeNode(5);
        four.left = new TreeNode(1);
        TreeNode extra = new TreeNode(2);
        four.right = extra;
        extra.left = new TreeNode(0);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        assertFalse(new SubtreeOfAnotherTree().isSubtree(root, subRoot));
    }
}