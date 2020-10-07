package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    @Test
    public void sample1() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;

        ListNode actual = new ReverseLinkedList().reverseList(head);
        assertEquals(node4, actual);
        assertEquals(node3, actual.next);
        assertEquals(node2, actual.next.next);
        assertEquals(node1, actual.next.next.next);
        assertEquals(head, actual.next.next.next.next);
    }

}