//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
package leetCode;

import linkedList.ListNode;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode front = null;
        ListNode last = null;
        ListNode temp = head;
        HashSet<Integer> set = new HashSet<>();

        while (head != null) {
            int currentVal = head.val;
            if (!set.contains(currentVal)) {
                if (head.next != null && currentVal == head.next.val) set.add(currentVal);
            }
            head = head.next;
        }

        while (temp != null) {
            int currentVal = temp.val;
            if (!set.contains(currentVal)) {
                if (front == null) {
                    front = new ListNode(currentVal);
                    last = front;
                } else {
                    last.next = new ListNode(currentVal);
                    last = last.next;
                }
            }
            temp = temp.next;
        }

        return front;
    }
}
