//https://leetcode.com/problems/rotate-list/
package leetCode;

import linkedList.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 1;
        ListNode oldTail = head;
        while (oldTail.next != null) {
            size++;
            oldTail = oldTail.next;
        }

        ListNode mid = head;
        k = k % size;
        int stepToNewHead = size - k;
        for (int i = 0; i < stepToNewHead - 1; i++) {
            mid = mid.next;
        }
        oldTail.next = head;
        head = mid.next;
        mid.next = null;

        return head;
    }
}
