//https://leetcode.com/problems/remove-linked-list-elements/
package leetCode;

import linkedList.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                if (prev != null) prev.next = current.next;
                else head = head.next;
            } else prev = current;
            current = current.next;
        }
        return head;
    }
}