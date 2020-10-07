package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateListTest {
    @Test
    public void sample1() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        node3.next = new ListNode(5);

        assertEquals(node3, new RotateList().rotateRight(head, 2));
    }

    @Test
    public void sample2() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;

        assertEquals(node1, new RotateList().rotateRight(head, 1));
    }
}