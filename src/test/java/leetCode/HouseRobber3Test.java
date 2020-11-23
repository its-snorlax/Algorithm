package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class HouseRobber3Test {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        root.left = two;
        TreeNode three = new TreeNode(3);
        root.right = three;
        two.right = new TreeNode(3);
        three.right = new TreeNode(1);

        assertEquals(7, new HouseRobber3().rob(root));
    }
    @Test
    public void sample2() {
        TreeNode root = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        root.left = four;
        TreeNode five = new TreeNode(5);
        root.right = five;
        four.left = new TreeNode(1);
        four.right = new TreeNode(3);
        five.right = new TreeNode(1);

        assertEquals(9, new HouseRobber3().rob(root));
    }
}