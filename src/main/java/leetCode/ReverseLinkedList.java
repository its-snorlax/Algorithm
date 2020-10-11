//https://leetcode.com/problems/reverse-linked-list
package leetCode;

import linkedList.ListNode;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseListUsingStack(ListNode head) {
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

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prevItem = null;
        ListNode nextItem;

        while (current != null) {
            nextItem = current.next;
            current.next = prevItem;
            prevItem = current;
            current = nextItem;
        }
        return prevItem;
    }

    public ListNode reverseListUsingRecursion(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode rest = reverseListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
