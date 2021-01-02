package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTest {
    @Test
    public void sample1() {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        original.right = three;
        three.left = new TreeNode(6);
        three.right = new TreeNode(19);

        TreeNode clone = new TreeNode(7);
        clone.left = new TreeNode(4);
        TreeNode threeClone = new TreeNode(3);
        clone.right = threeClone;
        threeClone.left = new TreeNode(6);
        threeClone.right = new TreeNode(19);

        assertEquals(threeClone, new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree()
                .getTargetCopy(original, clone, three));
    }
}