//https://leetcode.com/problems/reverse-linked-list
package leetCode;

import linkedList.ListNode;

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> listNodes = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            listNodes.push(temp);
            temp = temp.next;
        }
        ListNode tail = listNodes.pop();
        ListNode newHead = tail;
        while (!listNodes.isEmpty()) {
            if (listNodes.size() == 1) {
                tail.next = listNodes.pop();
                tail.next.next = null;
            } else {
                tail.next = listNodes.pop();
                tail = tail.next;
            }
        }
        return newHead;
    }
}
