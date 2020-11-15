package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class RangeSumOfBSTTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(10);
        TreeNode five = new TreeNode(5);
        root.left = five;
        TreeNode fifteen = new TreeNode(15);
        root.right = fifteen;
        fifteen.right = new TreeNode(18);
        five.left = new TreeNode(3);
        five.right = new TreeNode(7);

        assertEquals(32, new RangeSumOfBST().rangeSumBST(root, 7, 15));
    }

    @Test
    public void sample2() {
        TreeNode root = new TreeNode(10);
        TreeNode five = new TreeNode(5);
        root.left = five;
        TreeNode fifteen = new TreeNode(15);
        root.right = fifteen;
        fifteen.right = new TreeNode(18);
        fifteen.left = new TreeNode(13);
        TreeNode three = new TreeNode(3);
        five.left = three;
        three.left = new TreeNode(1);
        TreeNode seven = new TreeNode(7);
        five.right = seven;
        seven.left = new TreeNode(6);

        assertEquals(23, new RangeSumOfBST().rangeSumBST(root, 6, 10));
    }
}