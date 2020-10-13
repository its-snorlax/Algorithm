package leetCode;

import linkedList.ListNode;

public class LinkedListSort {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middle = getMiddle(head);
        ListNode nextToMiddle = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(nextToMiddle);
        return mergeList(left, right);
    }

    private ListNode mergeList(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;
        if (left.val < right.val) {
            left.next = mergeList(left.next, right);
            return left;
        } else {
            right.next = mergeList(left, right.next);
            return right;
        }
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = head;
        ListNode temp = head;
        while (temp.next != null && temp.next.next != null) {
            mid = mid.next;
            temp = temp.next.next;
        }
        return mid;
    }
}
