package leetCode;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class SerializeAndDeserializeBSTTest {
    @Test
    public void sampleTest1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        String encodeString = new SerializeAndDeserializeBST().serialize(root);
        assertEquals("2,1,3,", encodeString);
        System.out.println(root);
        TreeNode actualRoot = new SerializeAndDeserializeBST().deserialize(encodeString);
        assertEquals(root.val, actualRoot.val);
        assertEquals(root.left.val, actualRoot.left.val);
        assertEquals(root.right.val, actualRoot.right.val);
    }

    @Test
    public void sampleTest2() {
        assertEquals("", new SerializeAndDeserializeBST().serialize(null));
    }
}