//https://leetcode.com/problems/binary-search-tree-iterator/
package leetCode;

import tree.TreeNode;

import java.util.ArrayList;

public class BinarySearchTreeIterator {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        TreeNode fifteen = new TreeNode(15);
        root.right = fifteen;
        fifteen.left = new TreeNode(9);
        fifteen.right = new TreeNode(20);
        BSTIterator obj = new BSTIterator(root);
        System.out.println(obj.next());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
    }

    static class BSTIterator {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int current = 0;

        public BSTIterator(TreeNode root) {
            iterate(root);
        }

        private void iterate(TreeNode root) {
            if (root == null) return;
            iterate(root.left);
            list.add(root.val);
            iterate(root.right);
        }

        public int next() {
            return list.get(current++);
        }

        public boolean hasNext() {
            return current < list.size() ;
        }
    }

}
