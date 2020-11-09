package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.assertEquals;

public class MaximumDifferenceBetweenNodeAndAncestorTest {
    @Test
    public void sample1() {
        TreeNode root = new TreeNode(8);
        TreeNode three = new TreeNode(3);
        root.left = three;
        TreeNode ten = new TreeNode(10);
        root.right = ten;
        three.left = new TreeNode(1);
        TreeNode six = new TreeNode(6);
        three.right = six;
        six.left = new TreeNode(4);
        six.left = new TreeNode(7);
        TreeNode fourteen = new TreeNode(14);
        ten.right = fourteen;
        fourteen.left = new TreeNode(13);

        assertEquals(7,
                new MaximumDifferenceBetweenNodeAndAncestor()
                        .maxAncestorDiff(root));
    }
}