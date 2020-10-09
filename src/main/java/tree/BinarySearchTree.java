package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {

    private int totalNodes;
    private TreeNode root;

    public BinarySearchTree() {
        this.totalNodes = 0;
        this.root = null;
    }

    public void insert(int data) {
        root = createNode(root, data);
    }

    private TreeNode createNode(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            totalNodes++;
            return root;
        }

        if (data < root.data) {
            root.left = createNode(root.left, data);
        } else {
            root.right = createNode(root.right, data);
        }
        return root;
    }

    public void insertIteration(int data) {
        if (root == null) {
            root = new TreeNode(data);
            totalNodes++;
            return;
        }
        TreeNode temp = root;
        TreeNode leafNode = null;
        while (temp != null) {
            leafNode = temp;
            if (data < temp.data) temp = temp.left;
            else temp = temp.right;
        }
        temp = new TreeNode(data);
        if (leafNode.data > data) leafNode.left = temp;
        if (leafNode.data < data) leafNode.right = temp;
        totalNodes++;
    }

    public int getTotalNodes() {
        return totalNodes;
    }

    public List<Integer> preOrderTraverse() {
        if (root == null) {
            return Collections.emptyList();
        }
        ArrayList<Integer> output = new ArrayList<>();
        Stack<TreeNode> tempStack = new Stack<>();
        tempStack.push(root);
        while (!tempStack.isEmpty()) {
            TreeNode currentNode = tempStack.pop();
            output.add(currentNode.data);
            if (currentNode.right != null) {
                tempStack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                tempStack.push(currentNode.left);
            }
        }
        return output;
    }

    public List<Integer> inOrderTraverse() {
        if (root == null) {
            return Collections.emptyList();
        }
        ArrayList<Integer> output = new ArrayList<>();
        Stack<TreeNode> tempStack = new Stack<>();
        while (!tempStack.isEmpty() || root != null) {
            if (root != null) {
                tempStack.push(root);
                root = root.left;
            } else {
                TreeNode lastVisit = tempStack.pop();
                output.add(lastVisit.data);
                root = lastVisit.right;
            }
        }
        return output;
    }

    public List<Integer> postOrderTraverse() {
        if (root == null) {
            return Collections.emptyList();
        }
        ArrayList<Integer> output = new ArrayList<>();
        Stack<TreeNode> tempStack = new Stack<>();
        TreeNode lastVisit = null;
        while (!tempStack.isEmpty() || root != null) {
            if (root != null) {
                tempStack.push(root);
                root = root.left;
            } else {
                TreeNode peek = tempStack.peek();
                if (peek.right != null && lastVisit != peek.right) {
                    root = peek.right;
                } else {
                    output.add(peek.data);
                    lastVisit = tempStack.pop();
                }
            }
        }

        return output;
    }
}
