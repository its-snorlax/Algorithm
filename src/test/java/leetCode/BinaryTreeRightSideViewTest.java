package leetCode;

import org.junit.Test;
import tree.TreeNode;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeRightSideViewTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        root.left = two;
        two.right = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        root.right = three;
        three.right = new TreeNode(4);
        assertEquals(Arrays.toString(new int[]{1, 3, 4}),
                Arrays.toString(new BinaryTreeRightSideView().rightSideView(root).toArray()));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        root.left = two;
        two.left = new TreeNode(4);
        root.right = new TreeNode(3);
        assertEquals(Arrays.toString(new int[]{1, 3, 4}),
                Arrays.toString(new BinaryTreeRightSideView().rightSideView(root).toArray()));
    }
}