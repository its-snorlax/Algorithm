//https://leetcode.com/problems/insertion-sort-list/
package leetCode;

import linkedList.ListNode;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = null;
        ListNode newTail = null;

        while (head != null) {
            if (newHead == null) {
                newHead = new ListNode(head.val);
                newHead.next = null;
                newTail = newHead;
                head = head.next;
                continue;
            }
            ListNode newNode = new ListNode(head.val);
            if (head.val < newHead.val) {
                newNode.next = newHead;
                newHead = newNode;
            } else if (head.val > newTail.val) {
                newTail.next = newNode;
                newTail = newNode;
            } else {
                ListNode insertAfter = newHead;
                while (insertAfter.next != null && insertAfter.next.val < head.val) {
                    insertAfter = insertAfter.next;
                }
                newNode.next = insertAfter.next;
                insertAfter.next = newNode;
            }
            head = head.next;
        }
        return newHead;
    }
}
