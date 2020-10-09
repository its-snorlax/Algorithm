//https://leetcode.com/problems/serialize-and-deserialize-bst/
package leetCode;

import tree.TreeNode;

public class SerializeAndDeserializeBST {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        serializeInPreorder(root, stringBuilder);
        return stringBuilder.toString();
    }

    private void serializeInPreorder(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            return;
        }
        stringBuilder.append(root.val).append(",");
        serializeInPreorder(root.left, stringBuilder);
        serializeInPreorder(root.right, stringBuilder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }

        String[] tree = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(tree[0]));

        for (int i = 1; i < tree.length; i++) {
            int val = Integer.parseInt(tree[i]);
            TreeNode newNode = root;
            TreeNode leafNode = null;
            while (newNode != null) {
                leafNode = newNode;
                if (val < newNode.val) newNode = newNode.left;
                else newNode = newNode.right;
            }
            newNode = new TreeNode(val);
            if (leafNode.val > val) leafNode.left = newNode;
            if (leafNode.val < val) leafNode.right = newNode;
        }
        return root;
    }
}
