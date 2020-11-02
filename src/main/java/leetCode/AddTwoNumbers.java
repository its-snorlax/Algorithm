//https://leetcode.com/problems/add-two-numbers/
package leetCode;

import linkedList.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum;
        ListNode root = null;
        ListNode lastNode = null;

        while (l1 != null || l2 != null) {
            int x = 0;
            if (l1 != null) {
                    x = l1.val;
                l1 = l1.next;
            }
            int y = 0;
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            sum = x + y + carry;
            carry = 0;
            ListNode newNode;
            if (sum >= 10) {
                carry = 1;
                newNode = new ListNode(sum - 10);
            } else {
                newNode = new ListNode(sum);
            }

            if (lastNode == null) {
                root = newNode;
                lastNode = root;
            } else {
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        if (carry > 0) {
            lastNode.next = new ListNode(carry);
        }
        return root;
    }
}
