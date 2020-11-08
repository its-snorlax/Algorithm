package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class BinaryTreeTiltTest {
    @Test
    public void sample1() {
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        four.left = two;
        TreeNode nine = new TreeNode(9);
        four.right = nine;
        nine.right = new TreeNode(7);
        two.left = new TreeNode(3);
        two.right = new TreeNode(5);

        assertEquals(15, new BinaryTreeTilt().findTilt(four));
    }
}